/*
пробую использовать перегрузку методов
overload
p178/i-9

опеределяю тип переданного параметра в перегружаемый метод 
*/

class load{
	void load(){
		System.out.println("А тут пусто");
	}

	//если метод ниже закомментировать входящий int будет преобразован в double
	//иначе будет отработан как int
	
	/*void load(int p){
		System.out.println("Было передано целое число: "+p);
	}*/

	void load(double p){
		System.out.println("Было передано дробное число: "+p);
	}
	boolean load(String p){
		//System.out.println("Была передана строка: "+p);
		return false;
	}
}

class overload{
	public static void main(String args[]){
		load over=new load();

		//over.load();
		over.load(666); //int
		over.load(777.88); //double

		System.out.println(over.load("str"));
		//over.load("strinn");
	}
}