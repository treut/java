//Factorial

class factorial{
	int fact(int n){
		int res;

		if(n==1) return 1;
		res=fact(n-1)*n;
		return res;
	}
}

class recurs{
	public static void main(String args[]){
		factorial f=new factorial();

		System.out.println("Factorial 3 = "+f.fact(4));
	}
}