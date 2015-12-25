package dynamycDataStructures;

import java.util.Arrays;

public class App02 {

	public static void main(String[] args) {
		System.out.println(toString(genIter(0, 1, 2, 3, 4)));
		
		System.out.println(toString(genRec(5, 6, 7, 8, 9)));
		
		Node tailA = genIter(10, 20, 25, 25, 30);
		System.out.println(toString(tailA));
		
		Node tailB = genIter(15, 15, 25, 35, 40);
		System.out.println(toString(tailB));
		
		System.out.println(toString(merge(tailA, tailB)));

	}
//	Итерация
	public static Node genIter(int... values) {
		Node tail = null;
		for (int k = values.length-1; k >=0; k--){
			tail = new Node (values[k], tail);
		}
		return tail;
	}
//	Рекурсия
	public static Node genRec(int... values) {
		return values.length == 0 ? null : new Node (values[0], genRec(Arrays.copyOfRange(values, 1, values.length)));
	}
//	Слияние
	public static Node merge(Node tailA, Node tailB){
		if (tailA != null && tailB != null){
			if (tailA.value < tailB.value){
				return new Node(tailA.value, merge(tailA.next, tailB));
			}else{
				return new Node(tailB.value, merge(tailB.next, tailA));
			}
		}
		else return (tailA == null) ? tailA :tailB;
	}
//	Печать
	public static String toString(Node tail) {
		String result = "";
		while (tail != null) {
			result += tail.value + "->";
			tail = tail.next;
			
		}
		return result + "*";
	}

}
