
interface Generi<T>{
	T func(T t);
}


public class LambdaTest2{
	public static void main(String args[]){
		Generi<String> reve=(str)->{
			String res="";
			for(int i=str.length()-1; i>=0; i--){
				res+=str.charAt(i);
			}
			return res;
		};

		System.out.println("Lambda: "+reve.func("Lambda"));
	}
}