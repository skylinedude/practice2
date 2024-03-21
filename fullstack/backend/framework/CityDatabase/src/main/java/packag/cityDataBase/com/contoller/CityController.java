package packag.cityDataBase.com.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import packag.cityDataBase.com.model.Cities;
import packag.cityDataBase.com.service.ServiceClass;

public class CityController {
	
	@Autowired
	ServiceClass conn;
	
	@GetMapping("callme1")
	public String createCity(Cities cs) {
		conn.inputData(cs);
		return "data inserted";
	}
	@GetMapping("showdata")
	public String puttingData(Cities ct) {
		return conn.inputData(ct);
		
	}
}
