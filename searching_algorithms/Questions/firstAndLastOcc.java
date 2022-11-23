import java.util.Scanner;

public class firstAndLastOcc{
	
	static int firstOcc(int arr[], int n, int key){
		int start = 0;
		int end = n - 1;
		int ans = -1;
		
		while(start <= end){
			int mid = start + (end - start)/2;
			if(arr[mid] == key){
				ans = mid;
				end = mid - 1;
			}
			else if(key < arr[mid]){
				end = mid - 1;
			}
			else{
				start = mid + 1;
			}
		}
		
		return ans;
	}
	
	static int lastOcc(int arr[], int n, int key){
		int start = 0;
		int end = n - 1;
		int ans = -1;
		
		while(start <= end){
			int mid = start + (end - start)/2;
			if(arr[mid] == key){
				ans = mid;
				start = mid + 1;
			}
			else if(key < arr[mid]){
				end = mid - 1;
			}
			else{
				start = mid + 1;
			}
		}
		
		return ans;
	}
	
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int key = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		
		int first = firstOcc(arr, n, key);
		int last = lastOcc(arr, n, key);
		
		System.out.print(first + " " + last);
	}
}