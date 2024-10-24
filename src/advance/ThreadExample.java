package advance;

public class ThreadExample extends Thread{
	public ThreadExample(String name){
		super(name);
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		ThreadExample t1 =new ThreadExample("T1");
		ThreadExample t2 =new ThreadExample("T2");
		System.out.println("start execution t1");
		 System.out.println(t1.getState());
		t1.start();
         
			
		
        
         System.out.println("start execution t2");
         t2.start();
	}
	
	public  void run() {
		System.out.println("start"+Thread.currentThread().getName());
		
			for(int i=0;i<99999999;i++) {
				
			}
		
		System.out.println("end");
	}

}
