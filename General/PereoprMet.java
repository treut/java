class Figure{
	double d1;
	double d2;

	Figure(double a, double b){
		d1=a;
		d2=b;
	}

	double area(){
		System.out.println("Площадь не определена");
		return 0;
	}
}

class Rect extends Figure{
	Rect(double a, double b){
		super(a, b);
	}

	double area(){
		System.out.println("В четырехугольнике");
		return d1*d2;
	}
}

class Trian extends Figure{
	Trian(double a, double b){
		super(a, b);
	}

	double area(){
		System.out.println("В треугольнике");
		return d1*d2/2;
	}
}

class PereoprMet{
	public static void main(String args[]){
		Figure f=new Figure(10, 10);
		Rect r=new Rect(9, 5);
		Trian t=new Trian(10, 8);
		Figure fig;

		fig=r;
		System.out.println("S= "+fig.area());

		fig=t;
		System.out.println("S= "+fig.area());

		fig=f;
		System.out.println("S= "+fig.area());
	} 
}