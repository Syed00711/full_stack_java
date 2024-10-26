package advance;

public class ThreadExample extends Thread{
	public ThreadExample(String name){
		super(name);
	}
	static Check check;
	public static void main(String[] args) throws InterruptedException {

		ThreadExample t1 =new ThreadExample("T1");
		ThreadExample t2 =new ThreadExample("T2");
		check=new Check();

		t1.start();

         t2.start();
	}
	
	public  void run() {
synchronized(check) {
			 check.display(Thread.currentThread());
}

		
	}
	
	

}


class Check{
	public synchronized void display(Thread thread) {
		System.out.println("running"+thread.getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
