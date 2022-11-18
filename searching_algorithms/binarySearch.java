import java.util.Scanner;

public class binarySearch{
	
	static int binary_search(int arr[], int n, int key){
		int start = 0;
		int end = n - 1;
		while(start <= end){
			int mid = start + ((end - start)/2);	//(start+end)/2
			if(arr[mid] == key){
				return mid;
			}
			
			if(key < arr[mid]){
				end = mid - 1;
			}
			else{
				start = mid + 1;
			}
		}
		return -1;
	}
	//Time Complexity = O(logn);
	//Space Complexity = O(1);
	
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
	for (int i = 0; i< n; i++){
		arr[i] = sc.nextInt();
	}
	//number to found
	int key = sc.nextInt();
	
	int res = binary_search(arr, n, key);
	System.out.println("Index of " + key + " is " + res);
	}
}
	