//example enum

enum Apple{
	Jona(10, 111), Golda(9, 222), Reda, Wina(88, 333), Corta(8, 888);

	private int price;
	private int don;

	Apple(int price, int don){
		this.price=price;
		this.don=don;
	}
	Apple(){
		this.price=-1;
		this.don=-1;
	}

	int getPrice(){
		return price;
	}
	int getDon(){
		return don;
	}
}

public class EnumTest{
	public static void main(String args[]){
		Apple ap, ap2, ap3;

		ap=Apple.Jona;
		ap2=Apple.Golda;
		ap3=Apple.Jona;

		System.out.println("apple Wina price: "+Apple.Wina.getPrice()+" pos: "+Apple.Wina.ordinal()+"\n");

		System.out.println("All apples prices:");
		for(Apple a : Apple.values()){
			System.out.println(a+" price: "+a.getPrice()+" don: "+a.getDon()+" pos: "+a.ordinal());
		}

		if(ap.compareTo(ap3)==0){
			System.out.println("Clones1");
		}

		if(ap.equals(ap3)){
			System.out.println("Clones2");
		}
	}
}