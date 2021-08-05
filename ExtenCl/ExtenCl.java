//Extends
// super(w, h, d); <-- super for call constructor of SuperClass


class Parent{
	//private int a, b;
	int a, b, m;

	//constructor
	/*Parent(int a, int b){
		this.a=a;
		this.b=b;
	}*/

	void getp(){
		System.out.println("a & b : "+a+" & "+b);
	}
}

class Child extends Parent{
	int c;


	//for call constructor of SuperClass
	/*Child(int f, int g, int h){
		super(f, g);
		m=h;
	}*/

	void getc(){
		System.out.println("c : "+c);
	}
	void summ(){
		System.out.println("SUMM : "+(a+b+c));
	}
}

class ExtenCl{
	public static void main(String args[]){
		Parent par=new Parent();
		Child chi=new Child();

		par.a=chi.a=666;
		par.b=chi.b=777;
		par.getp();

		/*chi.a=111;
		chi.b=222;*/
		chi.c=999;
		chi.getc();
		chi.summ();
	}
}