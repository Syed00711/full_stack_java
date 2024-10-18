package advance;

public class Two extends One{
	
	public Two() {
		System.out.println("two");
	}
	
	public Two(int m) {
		super(5);
		System.out.println("param int two const");
	}
	
	public void check2() {
		
		super.check();
		
		TestSuper ts=new TestSuper();
		
		
		ts.check4(this);
	}

}
