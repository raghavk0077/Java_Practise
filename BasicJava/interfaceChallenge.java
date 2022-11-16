import java.lang.*;

interface member{
	void callBack();
}

class Store{
	member mem[] = new member[100];
	int count = 0;

	void register(member m){
		mem[count] = m;
		count++;
	}

	void inviteSale(){
		for (int i = 0; i < count; i++){
			mem[i].callBack();
		}
	}
}

class Customer implements member{
	private String name;
	
	Customer(String n){
		name = n;
	}

	public void callBack(){
		System.out.println("OK, I will visit " + name);
	}
}

public class interfaceChallenge
{
	public static void main(String[] args){
		Store s = new Store();
		Customer c1 = new Customer("Raghav");
		Customer c2 = new Customer("Riya");
		s.register(c1);
		s.register(c2);
		s.inviteSale();
	}
}