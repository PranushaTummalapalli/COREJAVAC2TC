package com.svkp.thiskeyword;

public class Demothis
{
	int id;
	String name;

	public Demothis(int i,String n) 
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+""+name);
	}
	public static void main(String[]args)
	{
		Demothis obj=new Demothis(101,"pranu");
		obj.display();
	}

}
