import java.lang.*;

class Rectangle {
	
	private double length;
	private double breadth;

	public Rectangle() {				//Non Parametrized Constructor
		length = 1;
		breadth = 1;
	}
	public Rectangle(double l, double b) {		//Parametrized Constructor
		setLength(l);
		setBreadth(b);
	}
	public Rectangle(double s) {			//Parametrized Constructor
		length = breadth = s;
	}

	public double getLength() {
		return length;
	}

	public double getBreadth(){
        	return breadth;
    	}
    
    	public void setLength(double l){
        	if(l >= 0)
            		length = l;
        	else
        		length = 0;
    	}
    	public void setBreadth(double b){
        	if(b >= 0)
            		breadth = b;
        	else
            		breadth = 0;
    	}
    
    	public double area(){
        	return length*breadth;
    	}
    	public double perimeter(){
        	return 2*(length+breadth);
    	}
    
    	public boolean isSquare(){
        	if(length == breadth)
            		return true;
        	else
            		return false;
    	}
}

public class RectangleTest{

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(23);
		
		System.out.println("Area = " + r1.area());
        	System.out.println("Perimeter = " + r1.perimeter());
        	System.out.println("Is it square = " + r1.isSquare());
	}

}