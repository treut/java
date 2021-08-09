package Pack;

class Bal{
	private String name;

	Bal(String name){
		this.name=name;
	}

	void show(){
		System.out.println("Name is: "+name);
	}
}

public class PackTest{
	public static void main(String args[]){
		Bal curr[]=new Bal[3];

		curr[0]=new Bal("Dronz");
		curr[1]=new Bal("Bromza");
		curr[2]=new Bal("Mronz");

		for(int i=0; i<3; i++) curr[i].show();
		//curr[1].show();
		//curr[2].show();
	}
}