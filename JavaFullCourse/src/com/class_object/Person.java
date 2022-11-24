package com.class_object;

public class Person 
{
	int age=23;
	int weight=65;
	String color="red";

	void eat()
	{
		System.out.println("I am eating");
	}
	void sleep()
	{
		System.out.println("I am sleeping");
	}
	
	
	
	public static void main(String[] args) 
	{
		Person obj=new Person();
		System.out.println(obj.age);
		System.out.println(obj.weight);
		System.out.println(obj.color);
		obj.eat();
		obj.sleep();

	}

}
