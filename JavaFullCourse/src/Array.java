import java.util.*;

public class Array 
{

	public static void main(String[] args) 
	{
		//int a[]= {10,20,30,40,50};
		int a[]=new int[5];
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter array element  : ");
		for(int i=0;i<5;i++)
		{
			a[i]=obj.nextInt();
		}
		Arrays.sort(a);
		System.out.print("array of sorted :");

		
		for(int b:a)//for each loop (Printing)
		{
			System.out.print(b+" ");
		}
		

	}

}
