package com.svkp.demoabstract;

abstract class parent 
{
  void show()
  {
	  System.out.println("This is normal method");
  }
  abstract void show1();
}
class child extends parent
{
	void show1()
	{
		System.out.println("This is abstract method");
	}
}


