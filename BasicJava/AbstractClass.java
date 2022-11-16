import java.lang.*;

abstract class Super{
	public Super(){
		System.out.println("Super constructor");
	}

	void meth1(){
		System.out.println("Meth 1 of super");
	}

	abstract void meth2();
}

class Sub extends Super{
	void meth2(){
		System.out.println("Meth 2 of Sub");
	}
}

public class AbstractClass{
	
	public static void main(String[] args){
		
		Super s = new Sub();
		s.meth1();
		s.meth2();
	}

}