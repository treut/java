abstract class Figure{
	double d1;
	double d2;
	Figure(double d1, double d2){
		this.d1=d1;
		this.d2=d2;
	}

	abstract double area();
}

class Rect extends Figure{
	Rect(double a, double b){
		super(a, b);
	}

	double area(){
		System.out.println("В четырехугольнике;");
		return d1*d2;
	}
}

class Tria extends Figure{
	Tria(double a, double b){
		super(a, b);
	}

	double area(){
		System.out.println("В треугольнике;");
		return d1*d2/2;
	}
}

public class Abstracta{
	public static void main(String args[]){
		//Figure f=new Figure(10, 10);//abstract, cannot be instantiated
		Rect r=new Rect(9, 5);
		Tria t=new Tria(10, 8);
		Figure fig;

		fig=r;
		System.out.println("S= "+fig.area());

		fig=t;
		System.out.println("S= "+fig.area());
	}
}