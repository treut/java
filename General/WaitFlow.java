class Q{
	int n;
	boolean vals=false;

	synchronized int get(){
		while(!vals){
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println("Перехват");
			}
		}

		System.out.println("Получено: "+n);
		vals=false;
		notify();
		return n;
	}

	synchronized void put(int n){
		while(vals){
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println("Перехват");
			}
		}

		this.n=n;
		vals=true;
		System.out.println("Отправлено: "+n);
		notify();
		
	}
}

class Producer implements Runnable{
	Q q;

	Producer(Q q){
		this.q=q;
		new Thread(this, "Sender").start();
	}

	public void run(){
		int i=0;
		while(true){
			q.put(i++);
		}
	}
}

class Consumer implements Runnable{
	Q q;

	Consumer(Q q){
		this.q=q;
		new Thread(this, "Accepter").start();
	}

	public void run(){
		while(true){
			q.get();
		}
	}
}

public class WaitFlow{
	public static void main(String args[]){
		Q q=new Q();
		new Producer(q);
		new Consumer(q);

		System.out.println("Press Ctrl-C for stopped!");
	}
}