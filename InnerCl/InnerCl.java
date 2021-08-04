/*
use inner class
*/
class Outer{
	int outer=333;

	void test(){
		Inner inner=new Inner();
		inner.display();
	}

	class Inner{
		void display(){
			System.out.println("variable outer="+outer);
		}
	}
}

class InnerCl{
	public static void main(String args[]){
		Outer outer=new Outer();
		outer.test();
	}
}