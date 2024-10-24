package advance;

public class RunnableExample implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		RunnableExample r1=new RunnableExample();
           Thread t1=new Thread(r1);
           t1.start();
           System.out.println("State:"+t1.getState());
           System.out.println("Name"+t1.getName());
           System.out.println("Id"+t1.getId());
           System.out.println("Live:"+t1.isAlive());
           System.out.println("Priority:"+t1.getPriority());
         
           t1.setPriority(1);
           Thread.sleep(7000);
           System.out.println("Live:"+t1.isAlive());
           
	}

	@Override
	public void run() {
		System.out.println("STart runnable thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
