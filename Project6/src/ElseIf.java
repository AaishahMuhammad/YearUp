import java.util.Scanner;
public class ElseIf 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int remainder = number % 2;
		
		if(remainder ==0)
		{
			System.out.println(number + "is even");
		}
		else
		{
			System.out.println(number + " is odd");
		}
		sc.close();

	}
	
}


