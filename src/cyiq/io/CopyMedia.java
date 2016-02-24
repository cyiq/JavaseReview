package cyiq.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMedia {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(new File("c:\\sql×¢Èë.pdf"));
			fos= new FileOutputStream(new File("d:\\sql×¢ÈëÐÂ.pdf"));
			byte [] buf = new byte[1024];
			int len = 0;
			while((len = fis.read(buf))!=-1){
				fos.write(buf);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fis!=null){
					fis.close();
				}
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
