class Gen<T>{
	T ob;

	Gen(T ob){
		this.ob=ob;
	}

	T getob(){
		return ob;
	}

	void showType(){
		System.out.println("Type T is: "+ob.getClass().getName());
	}
}



public class GenTest{
	public static void main(String args[]){
		
		Gen<Integer> iob=new Gen<Integer>(88);
		iob.showType();

		int v=iob.getob();
		System.out.println("Value: "+v+"\n");



		Gen<String> strob=new Gen<String>("Test Messages");
		strob.showType();

		String str=strob.getob();
		System.out.println("Value: "+str+"\n");
	}
}