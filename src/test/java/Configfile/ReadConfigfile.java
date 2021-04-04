package Configfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfigfile {
	
	
	
	public String CaptureVlauesFromPropertie(String str) throws Exception {
		
		Properties ObjPrope = new Properties();
		
		FileInputStream ObjFIS = new FileInputStream("C:\\SeleniumClass\\LiveProject\\Config.properties");
		
		ObjPrope.load(ObjFIS);
		
		String Opt = ObjPrope.getProperty(str);
		
		return Opt;
	}

	
	
	
	
}
