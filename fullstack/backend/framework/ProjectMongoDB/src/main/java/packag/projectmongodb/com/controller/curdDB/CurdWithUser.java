package packag.projectmongodb.com.controller.curdDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import packag.projectmongodb.com.model.UserInfoSchema;
import packag.projectmongodb.com.services.UserCurd;

@RestController
public class CurdWithUser {
	@Autowired
	private UserCurd services;
	
	@GetMapping("/save")
	public String addUserInfoToDb(UserInfoSchema user) {
		services.addUser(user);
		return "added";
	}
}
