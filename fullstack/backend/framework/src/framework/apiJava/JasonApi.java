package framework.apiJava;

import org.json.simple.JSONObject;

public class JasonApi {
	public static void main(String args[]){    
		JSONObject obj=new JSONObject();    
		  obj.put("name","sonoo");    
		  obj.put("age",new Integer(27));    
		  obj.put("salary",new Double(600000));    
		   System.out.print(obj);    
		}
}
