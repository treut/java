//Ограниченные метасимвольные аргументы 429

class TwoD{
	int x, y;
	 TwoD(int x, int y){
	 	this.x=x;
	 	this.y=y;
	 }
}


class ThreeD extends TwoD{
	int z;

	ThreeD(int x, int y, int z){
		super(x, y);
		this.z=z;
	}
}


class FourD extends ThreeD{
	int t;

	FourD(int x, int y, int z, int t){
		super(x, y, z);
		this.t=t;
	}
}


class Coords<T extends TwoD>{
	T coords[];

	Coords(T coords[]){
		this.coords=coords;
	}
}



public class BoundedCard{
	static void showXY(Coords<?> c){
		System.out.println("Coord X Y:");
		for(int i=0; i<c.coords.length; i++){
			System.out.println(c.coords[i].x+" "+c.coords[i].y);
			//System.out.println();
		}
	}

	static void showXYZ(Coords<? extends ThreeD> c){
		System.out.println("Coord X Y Z:");
		for(int i=0; i<c.coords.length; i++){
			System.out.println(c.coords[i].x+" "+c.coords[i].y+" "+c.coords[i].z);
			//System.out.println();
		}
	}

	public static void main(String args[]){
		TwoD td[]={
			new TwoD(0, 0),
			new TwoD(7, 9),
			new TwoD(18, 4),
			new TwoD(-1, -23)
		};

		Coords<TwoD> tdl=new Coords<TwoD>(td);
		
		System.out.println("Content object tdl..");
		showXY(tdl);


		ThreeD tds[]={
			new ThreeD(1, 2, 3),
			new ThreeD(6, 8, 14),
			new ThreeD(22, 9, 4),
			new ThreeD(3, -2, -23)
		};

		Coords<ThreeD> tkm=new Coords<ThreeD>(tds);


		System.out.println("Content object tkm..");
		showXY(tkm);
		showXYZ(tkm);
	}
}