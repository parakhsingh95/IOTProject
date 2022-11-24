package com.class_object;

abstract class animal
{
	void legs() 
	{
		System.out.println("all animals have 4 legs");//all animal ke liye common hoga.
	}
	abstract void sound();
	abstract void eat();
}
class Dog extends animal
{   
	@Override
	public void sound()
	{
		System.out.println("bow bow....");
	}
	public void eat()
	{
		System.out.println("meat eating");
	}
}
class cow extends animal
{
	public void sound()
	{
		System.out.println("Ooo Oooo....");
	}
	public void eat()
	{
		System.out.println("grass eating");
	}
}









public class AbsClass 
{

	public static void main(String[] args)
	{
		Dog d=new Dog();
		cow c=new cow();
		d.sound();
		d.eat(); d.legs();
		c.eat();
		c.sound(); c.legs();

	}

}
