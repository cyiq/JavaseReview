package cyiq.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader(new File("c:\\TestCopy.txt"));
		FileWriter newFile = new FileWriter(new File("D:\\TestCopy.txt"));
		
		char[] buf = new char[1024];
//		**以下代码造成的现象：如果文件长度不超过1024，剩余的会补成 's'
//		for(int index = 0 ; index < 1024 ; index++){
//			buf[index] = 's';
//		}
		int len = 0;
		int i = 1;
		while((len=file.read(buf))!=-1){
			file.read(buf, 0, len);
			newFile.write(buf);
			System.out.println("第"+i+"行写入完成");
			i++;
		}
		file.close();
		newFile.close();
	}
}
