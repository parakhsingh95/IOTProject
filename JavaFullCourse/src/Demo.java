import java.util.*;

public class Demo
{

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		StringBuffer str=new StringBuffer();
		System.out.println("Enter Name");
	     str.append(sc.nextLine());
	     str.setCharAt(3, 'u');
	     System.out.println(str);
	     str.insert(3, "ABCD");
	     str.setLength(20);
	     System.out.println(str);

	}

}
