package cyiq.exception;

public class TestException extends Exception {
	public TestException() {
		System.out.println("������testException");
	}
	public TestException(String msg) {
		System.out.println("������testException"+ msg);
	}

}
