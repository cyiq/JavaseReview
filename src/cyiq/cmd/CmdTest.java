package cyiq.cmd;

import java.io.IOException;

public class CmdTest {
	public static void main(String[] args) {
		
	String commandStrDot = new String("cmd /k start");
	System.out.println(commandStrDot);
	try {
	    Runtime.getRuntime().exec(commandStrDot);
	} catch (IOException e) {
	    e.printStackTrace();
	}
	}
}
