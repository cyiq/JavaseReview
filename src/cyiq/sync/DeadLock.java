package cyiq.sync;

class MyLock2{
	public static final Object locka = new Object();
	public static final Object lockb = new Object();
}

class Test2 implements Runnable{
	private boolean flag;
	Test2( boolean flag){
		this.flag = flag;
	}
	@Override
	public void run() {
		if(flag){
			while(true){
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (MyLock2.locka) {
					System.out.println(Thread.currentThread().getName()+"if locka");
					synchronized (MyLock2.lockb) {
						System.out.println(Thread.currentThread().getName()+"if lockb");
					}
				}
			}
		}else{
			while(true){
				synchronized (MyLock2.lockb) {
					System.err.println(Thread.currentThread().getName()+"else lockb");
					synchronized (MyLock2.locka) {
						System.err.println(Thread.currentThread().getName()+"else locka");
					}
				}
			}
			
		}
	}
	
}

public class DeadLock {
	public static void main(String[] args) {
		
	Test2 a = new Test2(true);
	Test2 b = new Test2(false);
	
	Thread t1 = new Thread(a);
	Thread t2 = new Thread(b);
	
	t1.start();
	t2.start();
	}
}
