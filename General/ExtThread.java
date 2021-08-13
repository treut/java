//create new class for lfows extends class Thread

class NewThread extends Thread{
	NewThread(){
		super("Title Flow");
		System.out.println("This children flow: "+this);
		start();
	}

	public void run(){
		try{
			for(int i=5; i>0; i--){
				System.out.println("Children flow: "+i);
				//Thread.sleep(500);
				this.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println("Children flow stopped!");
		}
		System.out.println("Children flow end.");
	}
}



public class ExtThread{
	public static void main(String args[]){
		new NewThread();
	}
}