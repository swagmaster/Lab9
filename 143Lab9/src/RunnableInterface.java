public class RunnableInterface implements Runnable{

	private String someString;
	
	@Override
	public void run() {
		System.out.println(someString);
	}
	
	public RunnableInterface(String str) {
		someString = str;
	}
	
	public static void main(String[] args) {
		Thread ri1 = new Thread(new RunnableInterface("test 1"));
		Thread ri2 = new Thread(new RunnableInterface("test 2"));
		
		ri1.start();
		ri2.start();
	}	
}