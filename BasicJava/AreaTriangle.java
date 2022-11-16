import java.lang.*;
import java.util.*;

public class AreaTriangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the base of triangle in cms: ");
		float base = sc.nextFloat();
		System.out.print("Enter the height of triangle in cms: "); 
		float height = sc.nextFloat();
		
		float area = (base * height) / 2;
		System.out.println("The area of triangle is " + area + " sq sms");
		
	}
}