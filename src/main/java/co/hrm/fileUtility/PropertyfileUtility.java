package co.hrm.fileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyfileUtility {

	
	public String getDataFromPropertyFile(String path,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Properties p = new Properties(); 
		
		p.load(fis);
		
		String data = p.getProperty(key);
		
		return data;
	}
	
}
