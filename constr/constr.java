class res{
	int a, b;

	res(int aa, int bb){
		a=aa;
		b=bb;
	}

	int resulta(){
		return a*b;
	}
}

class constr{
	public static void main(String args[]){
		res ss=new res(2, 2);

		System.out.println(ss.resulta());
	}
}