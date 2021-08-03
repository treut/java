/*
перегрузка конструктора и отправка объекта в параметры
*/

class met{
	int a, b;

	met(met m){
		a=m.a;
		b=m.b;
	}

	met(int a, int b){
		this.a=a;
		this.b=b;
	}

	met(){
		a=b=-1;
	}

	int result(){
		return a*b;
	}
}

class objmet{
	public static void main(String args[]){
		met m=new met(3, 4);
		met m2=new met(m);

		System.out.println("M: "+m.result());
		System.out.println("M2: "+m2.result());
	}
}