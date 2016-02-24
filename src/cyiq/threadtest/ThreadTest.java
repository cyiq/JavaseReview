package cyiq.threadtest;

public class ThreadTest {
	
	public static void main(String[] args) {
		Thread t1= new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i < 10;i++){
					System.out.println("Runnable....."+i);
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		MyThread t2 = new MyThread();
		
		t1.start();
		t1.start();
		t2.start();
	}
	
	
	
}

class MyThread extends Thread{
	public void run() {
		for(int i = 0; i < 10;i++){
			System.out.println(" Thread");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
