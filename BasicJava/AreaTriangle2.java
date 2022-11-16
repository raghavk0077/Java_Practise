import java.lang.*;
import java.util.Scanner;

public class AreaTriangle2
{
	public static void main(String args[])
	{
		float a, b, c, s;
		double area;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of three sides in cms: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();

		s = (a+b+c)/2;

		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle is " + area + " sq cms");
	}
}