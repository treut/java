//varargs

class VarArg{

	static void set(int v[]){
		System.out.println("count el: "+v.length);
		System.out.print("res: ");
		for(int x:v){
			System.out.print(x+"  ");
		}
		System.out.println();
	}

		static void anytext(String aaa){
			System.out.println(aaa);
		}
	public static void main(String args[]){

		int n1[]={111};
		int n2[]={1,2,3};
		int n3[]={};

		set(n1);
		anytext("alabalabala");
		//set(n2);
		//set(n3);
	}
}