import java.util.*;

public class stringClass
{

	public static void main(String[] args) 
	{
		String name;
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter name : ");
	  name=sc.nextLine();
	  
	  System.out.println(name.length());
	  System.out.println(name.toUpperCase());
	  System.out.println(name.toLowerCase());
	  System.out.println(name.charAt(3));
	  System.out.println(name.substring(1,4));
	  System.out.println(name.concat(" kumar "));
	  
	}
	

}
