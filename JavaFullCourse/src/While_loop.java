import java.util.*;

public class While_loop 
{

	public static void main(String[] args) 
	{
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number :");
		num=sc.nextInt();
		
		while(num>=0)
		{
			if(num%2==0)// (2/2=0)=even number
			{
				System.out.println("Even number");
				break;
			}
			else
			{
				System.out.println("Odd number");//(3/2=1)=odd number
				break;
			}
		}
		System.out.println("while loop ended");

	}

}
