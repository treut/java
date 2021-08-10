//example use try catch

public class Except{
	public static void main(String args[]){
		int d, a;

		try{
			d=0;
			a=42/d;

			System.out.println("This Not Print");
		}
		catch(ArithmeticException e){
			System.out.println("Division by zero! ==> "+e);
		}
		System.out.println("Print after operator catch");
	}
}