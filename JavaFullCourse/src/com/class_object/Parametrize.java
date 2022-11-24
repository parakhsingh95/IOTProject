package com.class_object;

 class Parametrize
{
	int a,b;//variable declare
    Parametrize(int x ,int y)
	{
		a=x;
		b=y;
	}
	void display()//method
	{
	  System.out.println(a +" "+b);
	}
	
class B
{
	public static void main(String[] args)
	{
		Parametrize obj=new Parametrize(100,200);
		obj.display();
		

	}

}
}