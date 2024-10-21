package advance;

public class ThisExample {
	
	int i=5;
	String s="this";
	ThisExample(){
		this(5);
		System.out.println("default constructoe");
	}
	
	
	ThisExample(int n){
		
		System.out.println("default constructoe");
	}

public void check() {

	this.number();
	System.out.println(this.i);
	System.out.println(this.s);
}
	
	
	public  void number() {
		System.out.println("this");
		TestSuper ts =new TestSuper();
		
	}

}
