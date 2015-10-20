import java.util.Scanner;

public class SwitchDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day of the week:");
		String dayOfWeek = sc.nextLine();

		switch(dayOfWeek)
		{
		case "Monday":
			System.out.println("I go to work and gym");
			break;
		case "Tuesday":
			System.out.println("I go to work and the bar");
			break;
		case "Wednesday":
			System.out.println("I go to work and the club");
			break;
		case "Thursday":
			System.out.println("I go to work and the restaurant");
			break;
		default:
			System.out.println("I stay home");
		}
		
		sc.close();

	}

}
