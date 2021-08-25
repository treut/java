//example import static class

//import static java.lang.Math.*;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;


public class StaticImport{
	public static void main(String args[]){
		double side1, side2;
		double hypot;
		side1=3.0;
		side2=4.0;

		//hypot=Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2)); //without name class before name method
		hypot=sqrt(pow(side1, 2)+pow(side2, 2));

		System.out.println("Gipotenuuza: "+side1+" + "+side2+" = "+hypot);
	}
}