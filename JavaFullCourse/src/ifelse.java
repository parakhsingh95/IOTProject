import java.util.*;
public class ifelse
{

	public static void main(String[] args) 
	{
	int pwd;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your password : ");
	pwd=sc.nextInt();
	
	if(pwd==2731)
	{
		System.out.println("My Name : parakh singh");
		System.out.println("contact : 7999748490");
		System.out.println("Age : 27");
		System.out.println("Address : risali");
		System.out.println("State : Chhatisgarh");
	}
	else
	{
		System.out.println("sorry! Wrong password ");
	}
	}

}
