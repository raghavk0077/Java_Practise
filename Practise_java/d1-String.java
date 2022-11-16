import java.util.*;

class d1String{
	
	public static void main(String[] args){
		char a[] = {'r', 'a', 'g', 'h', 'a', 'v'};
		String fname = new String(a);
		fname = "Khanna";
		
		for(int i = 0; i < fname.length(); i++){
		System.out.println(fname.charAt(i));
		}
		System.out.println(fname.substring(2, 6));
		System.out.println(String.join("Raghav"," ",fname));
	}
}