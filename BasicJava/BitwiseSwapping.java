import java.lang.*;
import java.util.Scanner;

public class BitwiseSwapping
{
	public static void main(String args[])
	{
		/*Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("a = " + a + " b = " + b);

		a = a^b;
		b = b^a;
		a = a^b;

		System.out.println("a = " + a + " b = " + b);*/

		byte a=7, b=15, c;
		c=(byte)(b<<4);
		c=(byte)(c|a);

		/*System.out.println("b = " + (c&0b11110000)>>4);
		System.out.println("a = " + (c&0b00001111));*/

		System.out.println((c&0b11110000)>>4);
     		System.out.println((c&0b00001111));
	}
}