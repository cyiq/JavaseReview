package cyiq.exception;

public class TestException extends Exception {
	public TestException() {
		System.out.println("发生了testException");
	}
	public TestException(String msg) {
		System.out.println("发生了testException"+ msg);
	}

}
