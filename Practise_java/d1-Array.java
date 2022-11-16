import java.util.*;
class d1Array1{
	
	static void max_ele(int array[]){
		int max = array[0];
		
		for(int i = 1; i < array.length; i++){
			if(max < array[i]){
				max = array[i];
			}
		}
		System.out.println("Max Element = " + max);
	}
	
	static int[] sort_ele(int array[]){
		int temp;
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length - i - 1; j++){
				if(array[j] > array[j+1]){
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	
	
	public static void main(String[] args){
		int sum = 0;
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
			sum += a[i];
		}
		
		int array[] = sort_ele(a);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		//max_ele(a);
	}
}