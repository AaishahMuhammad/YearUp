import java.io.FileNotFoundException;
import java.io.FileReader;

public class InputOutput {

	public static void main(String[] args) 
	{
      System.out.println("Hello world");
      
      try 
      {
		FileReader fileReader = new FileReader("C:/Users/elastudent04/OneDrive/Documents/ProjectFile/OOP_week15.txt");
	} catch (FileNotFoundException e) 
    {
		e.printStackTrace();
	}

	}

}
