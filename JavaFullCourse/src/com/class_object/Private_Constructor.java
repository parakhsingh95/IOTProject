package com.class_object;

 class Private_Constructor
{
	int a;
	double b; 
	String c;
	
	private Private_Constructor()
	{
		
		a=100;
		b=25.32;
		c="parakh";
		System.out.println(a+" "+b+ " " +c);
		
		
	}
	static void show ()
	{
		System.out.println("parakh  singh");
	}
	
	
	public static void main(String[] args) 
	{
		Private_Constructor obj=new Private_Constructor();
			obj.show();
	}

}
