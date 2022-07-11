package com.svkp.exceptions;

public class Demo_ClassNotFoundException {

	public static void main(String[] args) {
		try {
			Class.forName("Class1");   //Class1 is not defined
		}
		catch(ClassNotFoundException e) {
          System.out.println(e);
          System.out.println("Class Not Found....");
	    }

     }
}


