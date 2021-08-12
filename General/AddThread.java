//create additional thread

class NewThread implements Runnable{
	//Thread t;
	/*public void starto(String tname){
		Thread t=new Thread(this, tname);
		System.out.println("Children flow created: "+t);
		t.start();
	}*/

	NewThread(String tname){
		//starto(tname);
		Thread t=new Thread(this, tname);
		System.out.println("Children flow created: "+t);
		t.start();
	}

	public void run(){
		try{
			for(int i=5; i>0; i--){
				System.out.println("Children flow: "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println("Children flow stopped!");
		}

		System.out.println("Children flow end.");
	}
}


public class AddThread{
	public static void main(String args[]){
		new NewThread("Demo flowg");

		/*for(int ii=0; ii<6; ii++){
			new NewThread("FLOW "+ii);
		}*/
		
		/*try{
			for(int i=5; i>0; i--){
				System.out.println("Main flow: "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Main flow stopped!");
		}
		System.out.println("Main flow end.");*/
	}
}