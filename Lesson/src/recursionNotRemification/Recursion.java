package recursionNotRemification;

public class Recursion {

	public static void main(String[] args) {
		f(1);

	}

	public static void f(int arg) {
		System.out.print(" " + arg);
		if (arg < 7) {
			f(arg * 2);
		}
		System.out.print(" " + arg);
	}

}
