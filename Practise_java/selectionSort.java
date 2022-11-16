import java.util.Scanner;

public class selectionSort{
	
	/*static void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}*/
	
	static public void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		
		//selection sort
		int min;
		for(int i = 0; i < n - 1; i++){
			min = i;
			for(int j = i+1; j < n; j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
	}
}