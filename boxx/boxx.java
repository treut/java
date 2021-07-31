class box{
	int a, b, c;
}

class boxx{
	public static void main(String args[]){
		box bbox=new box();

		bbox.a=2;
		bbox.b=3;
		bbox.c=4;

		int resa=bbox.a*bbox.b*bbox.c;

		System.out.println("Box resa= "+resa);
	}
}