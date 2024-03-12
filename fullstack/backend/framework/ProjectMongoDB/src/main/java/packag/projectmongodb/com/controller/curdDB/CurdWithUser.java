package packag.projectmongodb.com.controller.curdDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import packag.projectmongodb.com.model.UserInfoSchema;
import packag.projectmongodb.com.services.UserCurd;

@RestController
public class CurdWithUser {
	@Autowired
	UserCurd services;
	
	@GetMapping("/save")
	public String addUserInfoToDb(UserInfoSchema user) {
		services.addUser(user);
		return "added";
	}
	@GetMapping("/show")
	public UserInfoSchema showdata(UserInfoSchema put) {
		
		return services.gettingdata(put);
		
	}
	@GetMapping("update")
	public UserInfoSchema updateData(UserInfoSchema up) {
		var datas=services.updateData(up);
		return datas;
	}
	@GetMapping("/deleted")
	public void deleteData(UserInfoSchema dell) {
		services.deleteData(dell);
	}
}
