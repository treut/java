/*
пробую public & private
*/

class control{
	int a;
	public int b;
	private int c;

	void set(int c){
		this.c=c;
	}
	int get(){
		return c;
	}
}

class accessco{
	public static void main(String args[]){
		control co=new control();

		co.a=33;
		co.b=66;
		//co.c=77; //error c has private access in control
		co.set(99);
		System.out.println("a "+co.a);
		System.out.println("b "+co.b);
		System.out.println("c "+co.get());
	}
}