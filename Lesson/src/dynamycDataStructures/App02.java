package dynamycDataStructures;

import java.util.Arrays;

public class App02 {

	public static void main(String[] args) {
		System.out.println("��������� ����������� �������" );
		System.out.println(toString(genIter(0, 1, 2, 3, 4)));
		
		System.out.println("��������� ����������� �������" );
		System.out.println(toString(genRec(5, 6, 7, 8, 9)));
		
		System.out.println("�������" );
		Node tailA = genIter(10, 20, 25, 25, 30);
		System.out.println("tailA " + toString(tailA));
		Node tailB = genRec(15, 15, 25, 35, 40);
		System.out.println("tailB" + toString(tailB));
		System.out.println("����������" + toString(merge(tailA, tailB)));
		
		System.out.println("�����������");
		Node tailA1 = genIter(11, 21, 26, 27, 36);
		Node tailC = merge(merge(tailA1, tailB), tailA);
		System.out.println("tailC -> " + toString(tailC));
		Node tailD = copy(tailC);
		System.out.println("tailD -> " + toString(tailD));

	}
//	��������
	public static Node genIter(int... values) {
		Node tail = null;
		for (int k = values.length-1; k >=0; k--){
			tail = new Node (values[k], tail);
		}
		return tail;
	}
//	��������
	public static Node genRec(int... values) {
		return values.length == 0 ? null : new Node (values[0], genRec(Arrays.copyOfRange(values, 1, values.length)));
	}
//	�������
	public static Node merge(Node tailA, Node tailB){
		if (tailA != null && tailB != null){
			if (tailA.value < tailB.value){
				return new Node(tailA.value, merge(tailA.next, tailB));
			}else{
				return new Node(tailB.value, merge(tailB.next, tailA));
			}
		}
		else return (tailB == null) ? tailA :tailB;
	}
//	�����������
	public static Node copy (Node tail){
		return tail == null ? null : new Node(tail.value, copy (tail.next));
	}
	
//	������
	public static String toString(Node tail) {
		String result = "";
		while (tail != null) {
			result += tail.value + "->";
			tail = tail.next;
			
		}
		return result + "*";
	}

}
