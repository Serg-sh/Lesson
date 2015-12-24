package recursionWithRemification;

public class Fibonache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i =0; i <= 20; i++){
//			System.out.println("Fib(" + i +") = " + fib(i));
//		}
		fib(5);
		

	}
	public static int fib(int arg) {
//		if (arg == 0)return 0;
//		else if (arg == 1) return 1;
//		else if (arg ==2) return 1;
//		else return fib(arg - 2) + fib(arg - 1);
		System.out.print(arg + " ");
		return arg < 2 ? 1 : fib(arg - 2) + fib(arg - 1);
	}

}
