                     /*super*/
package com.class_object;

class Test
{
   int a=10;
	
}

class B extends Test
{
	int a=100;
	
	void show()
	{
		System.out.println(a);
		System.out.println(super.a);
	}

}
		
class Super
	{
	public static void main(String[] args) 
	{
	   B obj=new B();
		obj.show();
	}

}


