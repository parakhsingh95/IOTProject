             //try -catch Exception Handling

package com.class_object;

public class A_exception
{

	public static void main(String[] args) 
	
	{
		System.out.println("main method start");
		int a=10,b=0,c;
		try 
		{
			c=a/b;
			System.out.println(c);
		} 
		catch (ArithmeticException e)
        {
		  System.out.println(e);
		}
		System.out.println("main method ended");

	}


}
