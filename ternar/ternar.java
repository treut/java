//пример с тернарным оператором
class ternar{
	public static void main(String args[]){
		int strin=0;
		System.out.println((strin!=0 ? "aaa " : "bbb "));

		switch(strin){
			case 1:{
				System.out.println("GOOD");
			}
			break;
			case 0:{
				System.out.println("BAAD");
			}
			break;
		}
	}
}