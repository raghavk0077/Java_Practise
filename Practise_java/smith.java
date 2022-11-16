import java.util.Scanner;

public class smith{
	
	static int digitsSum(int n){
		int digit = 0, sum = 0;
		while(n != 0){
			digit = n % 10;
			sum += digit;
			n = n/10;
		}
		
		return sum;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		int sum1 = 0, sum2 = 0;
		sum1 = digitsSum(num);
		for(int i = 2; i <= num; i++){
			while(num % i == 0){
				sum2 += digitsSum(i);
				num = num / i;
			}
		}
		
		System.out.println("sum1 = " + sum1);
		System.out.println("sum2 = "+ sum2);
		
		if(sum1 == sum2){
			System.out.println("Smith numbers!");
		}
		else{
			System.out.println("Not Smith numbers!");
		}
	}
}