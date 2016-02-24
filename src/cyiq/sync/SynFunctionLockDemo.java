package cyiq.sync;

class Ticket implements Runnable{
	private int num = 100;
	public static boolean flag = true;

	public void run() {
		
		if(flag){
			while(true){
				synchronized(this){
					if(num > 0){
						System.out.println(".....blank....num:"+num--);
						try{
							Thread.sleep(100);
						}catch(InterruptedException e){
							e.printStackTrace();
						}
					}
				}
			}
		}else{
			while(true){
				fn_show();
			}
		}
	}
	
	private synchronized void fn_show(){
		if(num > 0){
			System.err.println(".....function....num:"+num--);
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class SynFunctionLockDemo {
	
	public static void main(String[] args) {
		Ticket t = new Ticket();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.flag = false;
		t2.start();
	}
}
