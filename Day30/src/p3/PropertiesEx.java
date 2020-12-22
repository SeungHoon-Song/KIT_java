package p3;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) {
		Properties prop = new Properties();	//객체 생성
		//키, 값 넣기
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		prop.put("a","100");
		
		System.out.println(prop.get("a")+"~~~");
		
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
//			System.out.println(prop.getProperty(element));
			System.out.println(prop.get(element));
		}
	}

}
