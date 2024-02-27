package packag.projectmongodb.com.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import packag.projectmongodb.com.dao.UserConnectSchemaDb;
import packag.projectmongodb.com.model.UserInfoSchema;


@Service
public class UserCurd {
		@Autowired
	private   UserConnectSchemaDb  con;
		
		public void addUser(UserInfoSchema user){
			user.setName("Elle");
			user.setChocalate("KitKat");
			con.insert(user);
		}
}
