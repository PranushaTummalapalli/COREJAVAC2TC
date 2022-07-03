package com.svkp.constructor;

public class DemoConstructor 
{
	int num1;
	int num2;
	
	public DemoConstructor(int num1,int num2) {
		super();
		this.num1=num1;
		this.num2=num2;
		
	}
	void display()
	{
		System.out.println("This is example for adding two numbers"   +    (num1+num2));
	}

	public static void main(String[] args)
	{
		DemoConstructor obj= new DemoConstructor(10,30);
        obj.display();
	}

}
