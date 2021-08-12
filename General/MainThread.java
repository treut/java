//example use thread

public class MainThread{
	public static void main(String args[]){
		Thread mt=Thread.currentThread();

		System.out.println("Current flow: "+mt);

		mt.setName("Treut Thread");
		System.out.println("After change thread name: "+mt);
		try{
			for(int n=5; n>0; n--){
				System.out.println(n);
				Thread.sleep(1000);
				//mt.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Main Thread stopped");
		}
	}
}