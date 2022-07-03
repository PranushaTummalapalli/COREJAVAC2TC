package com.svkp.statickeyword;

public class Student 
{
	int sid;
	String sname;
	static String collegename="SVKP";
	

	public Student(int sid,String sname) {
		super();
		this.sid=sid;
		this.sname=sname;
	}
	void display()
	{
		System.out.println(sid+"" +sname+"" +collegename);
	}
	
	public static void main(String[]args)
	{
		Student obj=new Student(101,"Ravi");
		Student obj1=new Student(102,"Sita");
		
		obj.display();
		obj1.display();
	}

}
