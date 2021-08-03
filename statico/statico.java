/*
use static & final
*/

class stat{
	static int a=11;
	static int b=22;

	static void funn(){
		System.out.println("a="+a);
	}
}

class statico{
	public static void main(String args[]){
		final int TEST_VAR=1111; //create define
		
		//stat.a=555;
		stat.funn();
		System.out.println("STAT b: "+stat.b);
	}
}