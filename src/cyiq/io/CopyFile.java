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
//		**���´�����ɵ���������ļ����Ȳ�����1024��ʣ��ĻᲹ�� 's'
//		for(int index = 0 ; index < 1024 ; index++){
//			buf[index] = 's';
//		}
		int len = 0;
		int i = 1;
		while((len=file.read(buf))!=-1){
			file.read(buf, 0, len);
			newFile.write(buf);
			System.out.println("��"+i+"��д�����");
			i++;
		}
		file.close();
		newFile.close();
	}
}
