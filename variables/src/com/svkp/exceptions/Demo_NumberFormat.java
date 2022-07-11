package com.svkp.exceptions;

public class Demo_NumberFormat {

	public static void main(String[] args) {
		try
		{
			int num = Integer.parseInt("paru");
			System.out.println("num");
		}
		catch(NumberFormatException ex)
		{
			System.out.println("number formate exception");
		}
	}

	}


