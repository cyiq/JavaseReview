package cyiq.exception;

public class Test {
	private static boolean flag = true;
	public static  void test1() { 
		if(!flag){
		}
		throw new ArrayIndexOutOfBoundsException();
	}
	
	public static void main(String[] args) {
		try {
			test1();
		} finally{
			System.out.println("都没有捕获到");
		}
	}
	
}
