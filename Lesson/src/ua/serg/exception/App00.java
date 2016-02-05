package ua.serg.exception;

import java.io.IOException;

public class App00 {

	public static void main(String[] args) throws Exception {
		// throw new Error();
		// throw new Exception();
		Exception ref = new IOException();
		System.err.println(1);
		System.err.println("App00.main()");
		try {
			throw ref;
		} catch (RuntimeException | IOException e) {
			throw new Exception (e);
		}
		

	}
	
}
