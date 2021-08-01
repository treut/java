
class set{
	int a, b;

	int resulta(){
		return a*b;
	}

	void seta(int aa, int bb){
		a=aa;
		b=bb;
	}
}

class classa{
	public static void main(String args[]){
		int result;

		set ss=new set();
		ss.seta(5, 4);

		result=ss.resulta();

		System.out.println("result: "+result);
	}
}