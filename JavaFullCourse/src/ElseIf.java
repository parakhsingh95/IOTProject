import java.util.*;
public class ElseIf {

	public static void main(String[] args) 
	{
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Marks :");
		marks=sc.nextInt();
		
		if(marks>=60 && marks<=90)
		{
			System.out.println("First Division");
		}
		else if(marks>=50 && marks<=60)
		{
			System.out.println("Second Division");
		}
		else if(marks>=40 && marks<=50)
		{
			System.out.println("Third Division");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
