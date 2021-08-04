//varargs
//04 aug 23-00 changed (add 2, 3 variant)
//+OverloadVarArg=overload

class VarArg{

	//static void set(int v[]){ //VARIANT 1
	//static void set(int ... v){ //VARIANT 2
	static void set(int a, int ... v){ //VARIANT 3
		System.out.println("count el: "+v.length);
		System.out.print("res: ");
		for(int x:v){
			System.out.print(x+"  ");
		}
		System.out.println();
	}

	public static void main(String args[]){

		//FOR VARIANT 1 OR 2
		int n1[]={111};
		int n2[]={1, 2, 3};
		int n3[]={};


		//FOR VARIANT 1 OR 2
		/*
		set(n1);
		set(n2);
		set(n3);
		*/


		//FOR VARIANT 2 OR 3
		set(222);
		set(6, 7, 8);
		set(888);
	}
}