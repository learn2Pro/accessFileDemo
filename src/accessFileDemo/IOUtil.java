package accessFileDemo;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 读取指定文件内容，按照16进制输出
 * 并且每输出10个byte换行
 * @author tang
 *
 */
public class IOUtil {
	public static void printHex(String fileName)throws IOException{
    	FileInputStream in=new FileInputStream(fileName);
    	int b;
    	int i=1;
    	while((b=in.read())!=-1){
    		if(b<=0xf){
    			System.out.print("0");
    		}
    		System.out.print(Integer.toHexString(b)+" ");
        if(i++%10==0) System.out.println();
    	}
	}
}
