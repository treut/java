//Synchronized example
class Callc{
	void call(String msg){
		System.out.print("["+msg);
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("Stopped!");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable{
	String msg;
	Callc target;
	Thread t;

	public Caller(Callc target, String msg){
		this.target=target;
		this.msg=msg;
		t=new Thread(this);
		t.start();
	}

	public void run(){
		synchronized(target){
			target.call(msg);
		}
	}
}

public class SynchronizedTest{
	public static void main(String args[]){
		Callc target=new Callc();
		Caller c1=new Caller(target, "Welcome");
		Caller c2=new Caller(target, "to synchronized");
		Caller c3=new Caller(target, "world!");

		try{
			c1.t.join();
			c2.t.join();
			c3.t.join();
		}
		catch(InterruptedException e){
			System.out.println("Stopped main flow!");
		}
	}
}