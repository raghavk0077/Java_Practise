import java.lang.*;
import java.util.Scanner;

public class Cuboid
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int length, breadth, height, totalArea, Volume;

		System.out.println("Enter length in cms: ");
		length = sc.nextInt();
		System.out.println("Enter breadth in cms: ");
		breadth = sc.nextInt();
		System.out.println("Enter height in cms: ");
		height = sc.nextInt();

		totalArea = 2*(length*breadth + length*height + breadth*height);
		Volume = length*breadth*height;

		System.out.println("Total area of cuboid is: " + totalArea + "\nVolume of cuboid is: " + Volume);
	}
}