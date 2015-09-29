
public class CalculateArea {

	public static void main(String[] args) 
	{
	  System.out.println("I am going to calculate the area of a circle");
	  double circleAreaInMainMethod = CalculateCircleArea(10);
	  System.out.println("Area of the circle is " + circleAreaInMainMethod);
	  
	  
	  System.out.println("I am going to calculate the area of a rectangle");
	 double area = AreaRect(3, 3);
	 System.out.println ("Area of the rectangle is " + area);
    }
   
	public static double CalculateCircleArea(int radius)
	{
		
		double area = 3.14 * radius * radius;
		return area;
	}

	public static double AreaRect(int width, int length){
		double area = length * width;
		return area;
	}
}
