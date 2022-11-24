package com.class_object;

public class A 
{
	int a;
	String b;
	A()// Default constructor
	{
		 a=100;
		 b="parakh";
	}
	void show()
	{
		System.out.println(a +" " +b);
	}

	public static void main(String[] args) 
	{
		A obj=new A();
		obj.show();

	}

}
