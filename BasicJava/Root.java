import java.lang.*;
import java.util.Scanner;

public class Root
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int a, b, c, D;
		double r1, r2;

		System.out.println("Enter the coefficients of quadritic equation starting with highest degree ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		D = (b*b) - (4*a*c);
		if(D >= 0){
		r1 = (-(b) + Math.sqrt(D))/(2*a);
		r2 = (-(b) - Math.sqrt(D))/(2*a);
		System.out.println("Root 1: " + r1 + "\nRoot 2: " + r2);
		}
		else{
		System.out.println("Try different coefficients");
		}
	}
}