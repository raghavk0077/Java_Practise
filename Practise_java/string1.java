import java.util.*;

class string1{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String word1 = "", word2 = "";
		int n = str.length()/2;
		
		for(int i = n - 1; i >= 0; i--){
			word1 += str.charAt(i);
		}
		for(int i = str.length() - 1; i >= n; i--){
			word2 += str.charAt(i);
		}
		
		String res = word1 + word2;
		
		//System.out.println(word1.equals(word2));
		
		System.out.println(res);
	}
}
		
		