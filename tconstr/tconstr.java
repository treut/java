/*
пробую пример с созданием конструктора класса
*/
class box{
	int a;
	int b;

	box(int a, int b){
		this.a=a;
		this.b=b;
	}

	int result(){
		return a*b;
	}
}

class tconstr{
	public static void main(String args[]){
		box vbox=new box(7, 7);

		System.out.println("result: "+vbox.result());
	}
}