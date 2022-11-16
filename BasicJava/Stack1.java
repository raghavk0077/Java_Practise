import java.util.*;

class Stack1{
	public static void main(String[] args){
		Stack <String> st= new Stack<>();
		st.push("1");
		st.push("2");
		st.push("28");
		st.push("11");	
		
		System.out.println(st);
		st.pop();
		System.out.println(st);	
		System.out.println("Peek = "+ st.peek());

		System.out.println("Empty = " + st.empty());
		
		Iterator <String> itr = st.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}