package cyiq.threadtest;

public class ThreadTest {
	public static void main(String[] args) {
			
		new Thread(new Runnable()	{
			public void run(){
				System.out.println("runnable run");
			}
		}){
			public void run(){
				System.out.println("subThread run");
			}
		}.start();
	}
}
