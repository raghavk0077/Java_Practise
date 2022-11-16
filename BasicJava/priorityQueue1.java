import java.util.*;

class PriorityQueue1{
	public static void main(String[] args){
		ArrayDeque <String> pq = new ArrayDeque<>();
		pq.add("A");
		pq.add("X");
		pq.add("Y");
		pq.add("C");	
		
		System.out.println(pq);

		System.out.println(pq.element());
		pq.pollFirst();
		System.out.println(pq.element());

		Iterator <String> itr = pq.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		//System.out.println("Chidkuuuuuuuu");
	
	}
}