                     //Encapsulation//
package com.class_object;
import java.util.*;

 class Bank 
{  
	 private double bal=500000;
	 private int pwd;
	 
	 public void Deposite(double money)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Password:-");
		 pwd=sc.nextInt();
		 
		 if(pwd==2022)
		 {
			 bal=bal+money;
			 System.out.println("Deposite :"+money);
			 System.out.println("Total Balance :"+bal);
		 }
		 else
		 {
			 System.out.println("Password is invalid!!!!");
		 }
	 }
	 public void Withdrawl(double money)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Password:-");
		 pwd=sc.nextInt();
		 
		 if(pwd==2022)
		 {
			 bal=bal-money;
			 System.out.println("Withdrawl :"+money);
			 System.out.println("Total Balance :"+bal);
		 }
		 else
		 {
			 System.out.println("Password is invalid!!!!");
		 }
	 }
	 public void checkBal()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter password");
		 pwd=sc.nextInt();
		 
		 if(pwd==2022)
		 {
			 System.out.println("Total Balance"+bal);
		 }
	 }


	public static void main(String[] args) 
	{
		
         Bank b=new Bank();
        int ch;
        System.out.println("1. Deposite : ");
        System.out.println("2. Withdrawl : ");
        System.out.println("3. checkBal : ");
        System.out.println("\n Enter your choice : ");
        Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();
        switch(ch)
        {
        case 1:b.Deposite(1000);
        	
        	break;
        case 2:b.Withdrawl(2000);
        	
        	break;
        case 3:b.checkBal();
        break;
        default:
        	System.out.println("invalid choice : ");
        	
        }
	}

}

