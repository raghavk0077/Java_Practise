import java.util.*;

class commonElements{
	
	public static void main(String[] args){
		int a1[] = {1,2,3,4,5,6,7,8,9};
		int a2[] = {4,5,6,7,8,9};
		int a3[] = {1,2,6,7,9};
		
		int temp[] = new int[a2.length];
		int count = 0;
		
		int res[] = new int [a3.length];
		int index = 0;
		
		
		for(int i = 0; i < a1.length; i++){
			for(int j = 0; j < a2.length; j++){
				if(a1[i] == a2[j]){
					temp[count] = a1[i];
					count++;
				}
			}
		}
		
		for(int i = 0; i < a3.length; i++){
			for(int j = 0; j < temp.length; j++){
				if(a3[i] == temp[j]){
					System.out.print(temp[j] + " ");
				}
			}
		}
		
		
	}
}
			
			