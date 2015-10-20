
public class Main {

	public static void main(String[] args) 
	{
		PersonEncapsulation instructor = new PersonEncapsulation("Aaishah Muhammad", 19, "4703382181", "536 Trailside Way");
		System.out.println("Instructor's name is " + instructor.GetName());
		System.out.println("Instructor's age is " + instructor.GetAge());
		System.out.println("Instructor's phone number is " + instructor.GetPhoneNumber());
		System.out.println("Instructor's address is " + instructor.GetAddress());
		instructor.GrowsOlder();
		System.out.println("Instructor's age is now " + instructor.GetAge());
		

	}

}
