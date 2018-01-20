package page;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
 
 

public class ReadProperties {
	public static String readProperties(String  filePath,String args) {
		String s=null;
		Properties prop = new Properties();     
		         try{
		             //读取属性文件a.properties
		             InputStream in = new BufferedInputStream (new FileInputStream(filePath));
		             prop.load(in);     ///加载属性列表
		             Iterator<String> it=prop.stringPropertyNames().iterator();
		            while(it.hasNext()){
		                String key=it.next();
		            if (args.equals(key)) {
					  s=  prop.getProperty(key);
					}
		            	}
		             in.close();
		         }
		         catch(Exception e){
		        	              System.out.println(e);
		        	      }
				return  s;
		 
	}
}

