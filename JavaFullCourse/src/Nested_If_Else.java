import java.util.Scanner;

public class Nested_If_Else {

	public static void main(String[] args) 
	{    int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1 : ");
		num1=sc.nextInt();
		System.out.println("enter num2 : ");
		num2=sc.nextInt();
		System.out.println("enter num3 : ");
		num3=sc.nextInt();
		
		
		if(num1>num2)//20>10
		{
			if(num1>num3)//20>45
			{
				System.out.println("Maximum number"+num1);
			}
			else
			{
				System.out.println("Maximum number"+num3);//num3=45
			}
		}
		else
		{
			if(num2>num3)//100>45
			{
				System.out.println("Maximum number"+num2);//num2=100
			}
			else 
			{
				System.out.println("Maximum number"+num3);
			}
		}
	}

}
