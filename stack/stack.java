/*
пробую пример класса со стеком
*/
class sta{
	int stack[]=new int[10];
	int pos;

	sta(){
		pos=-1;
	}

	void push(int item){
		if(pos==9) System.out.println("стек заполнен");
		else stack[++pos]=item;
	}

	int pop(){
		if(pos<0){
			System.out.println("Стек пуст");
			return 0;
		}
		else return stack[pos--];
	}
}

class stack{
	public static void main(String args[]){
		sta stac=new sta();

		for(int i=172; i<178; i++) stac.push(i);
		System.out.println(stac.pop());
		System.out.println(stac.pop());
		System.out.println(stac.pop());
	}
}