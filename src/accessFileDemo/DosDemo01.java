package accessFileDemo;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosDemo01 {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
       String file="demo/dos.dat";
       DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
       dos.writeInt(10);
       dos.writeInt(-10);
       dos.writeLong(10l);
       dos.writeDouble(10.5);
       
       //utf-8
       dos.writeUTF("�й�");
       dos.writeChars("�й�");
       
       dos.close();
       
       IOUtil.printHex(file);
	}

}
