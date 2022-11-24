package com.class_object;

interface Vehicle
{
	String Name="Tvs"; //public+ Static +Final
	int speed=100;     //public +Static+ Final
	
	void start(); //public+Abstract
	void stop();  //public +Abstract
	
}


 class Customer_inter implements Vehicle 
 {
	 @Override
  public void start()
  {
	  System.out.println("start() : Insert key & press Start button");
  } 
  
  @Override
  public void stop()
  {
	  System.out.println("stop() : Exit key ");
  }
	 
	 
	 
	 
	public static void main(String[] args) 
	{
		Customer_inter obj=new Customer_inter();
		obj.start(); obj.stop();
	     System.out.println(speed);//bina obj ke access kar rahe because speed is static
	     System.out.println(Name);

	}

}
