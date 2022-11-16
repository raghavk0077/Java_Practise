import java.util.Scanner;

public class primeFactorisation{
	
	/*boolean prime(int n){
		//boolean flag = true;
		for(int i = 2; i <= n/2; i++){
			if(n % i == 0){
				return false;
				//break;
			}
		}
		return true;
	}*/
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 2; i <= n; i++){
			while(n % i == 0){
				System.out.print(i+" ");
				n = n/i;
			}
		}
	}
}
		