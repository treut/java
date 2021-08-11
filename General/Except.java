//example use try catch
//add method testf() 11.08
//add lib Random

import java.util.Random;


public class Except{
	static void testf(){
		int d=0;
		int a=42/d;
	}
	public static void main(String args[]){
		//int d, a;

		Random r=new Random();

		try{
			//d=0;
			//a=42/d;
			//Except.testf();

			testf();

			System.out.println("This Not Print");
		}
		catch(ArithmeticException e){
			System.out.println("Division by zero! --> "+e);
		}
		System.out.println("----------------\nPrint after operator catch "+r.nextInt());
	}
}