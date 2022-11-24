import java.util.*;

public class for_loop_Table
{

	public static void main(String[] args) 
	{
		int num,i;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter tabel number :-");
		num=sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}
	}

}
