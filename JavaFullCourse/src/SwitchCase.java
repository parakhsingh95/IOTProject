import java .util.*;
public class SwitchCase 
{

	public static void main(String[] args) 
	{
		int a,b,c,ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First number : ");
		a=sc.nextInt();
		System.out.print("Enter Second number : ");
		b=sc.nextInt();
		System.out.print("Enter your choice : ");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			c=a+b;
			System.out.println("Addition :"+c);
			break;
		case 2:
			c=a-b;
			System.out.println("Subtraction :"+c);
			break;
		case 3:
			c=a*b;
			System.out.println("Multiplication :"+c);
			break;
		case 4:
			c=a/b;
			System.out.println("Division :"+c);
			break;
		case 5:
			c=a%b;//remainder
			System.out.println("Remainder :"+c);
			break; 
			
			default:
				System.out.println("Invalid Choice...... ");
				
		}
		
		

	}

}
