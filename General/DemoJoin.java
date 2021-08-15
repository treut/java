//use isAlive() & join() for Thread's

class NewThread implements Runnable{
	String name;
	Thread t;

	NewThread(String name){
		this.name=name;
		t=new Thread(this, name);
		System.out.println("Flow is: "+t);
		t.start();
	}

	public void run(){
		try{
			System.out.println("Start flow");
			//t.setPriority(11); //Exception! priority 1-10
			t.setPriority(5);
			System.out.println("Priority this flow: "+t.getPriority());
			Thread.sleep(2000);
		}
		//catch(InterruptedException e){
		catch(Exception e){
			System.out.println("Flow stopped!");
		}
		System.out.println("End flow!");
	}
}

public class DemoJoin{
	public static void main(String args[]){
		NewThread t1=new NewThread("One");

		System.out.println("Flow One started: "+t1.t.isAlive());

		try{
			System.out.println("Waiting for completion flows");

			t1.t.join();
		}
		//catch(InterruptedException e){
		catch(Exception e){
			System.out.println("Main flow stopped!");
		}

		System.out.println("Flow One started: "+t1.t.isAlive());
		System.out.println("Main flow end!");
	}
}