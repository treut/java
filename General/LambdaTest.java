public class LambdaTest{
	public static void main(String args[]){
		Operat op;
		//op=(x, y)->x+y;
		op=()->100+20;

		//int result=op.calculate(10, 20);
		int result=op.calculate();
		System.out.println(result);
	}
}

interface Operat{
	//int calculate(int x, int y);
	int calculate();
}