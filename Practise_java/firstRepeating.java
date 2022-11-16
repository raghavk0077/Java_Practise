import java.util.*;

class firstRepeating{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Size: ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		
		boolean flag = false;
		for(int i = 0; i < n; i++){
			for(int j = 1; j < n; j++){
				if(array[i] == array[j]){
					System.out.print(array[i]);
					flag = true;
					break;
				}
			}
			if(flag == true){
				break;
			}
		}
	}
}