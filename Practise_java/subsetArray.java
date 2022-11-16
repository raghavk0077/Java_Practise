import java.util.*;

class subsetArray{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		int a1[] = new int[n1];
		int a2[] = new int[n2];
		
		for(int i = 0; i < n1; i++){
			a1[i] = sc.nextInt();
		}
		for(int i = 0; i < n2; i++){
			a2[i] = sc.nextInt();
		}
		
		boolean flag = true;
		
		for(int i = 0; i < n2; i++){
			boolean check = false;
			for(int j = 0; j < n1; j++){
				if(a2[j] == a1[i]){
					check = true;
					break;
				}
			}
			
			if(check == false){
				flag = false;
				break;
			}
		}
		
		if(flag == true){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}