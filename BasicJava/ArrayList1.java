import java.util.*;

class ArrayList1{
	public static void main(String[] args){
		ArrayList <String> alist = new ArrayList<>();
		alist.add("1");
		alist.add("2");
		alist.add("28");
		alist.add("11");	
		
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println(alist);	
		System.out.println("Size = "+ alist.size());
		alist.remove(2);
		
		Iterator <String> itr = alist.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}