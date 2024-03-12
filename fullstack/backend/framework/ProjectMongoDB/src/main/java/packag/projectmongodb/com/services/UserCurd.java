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
			user.setId(103);
			user.setName("Manoj");
			user.setChocalate("Kit Kat");
			con.insert(user);
			user.setId(104);
			user.setName("Chandan");
			user.setChocalate("Kaccha Mango");
			con.insert(user);
		}
		public UserInfoSchema gettingdata(UserInfoSchema user) {
			user.setId(10);
			var info=con.findById(user.getId()).orElse(null);
			return info;
					
		}
		public UserInfoSchema updateData(UserInfoSchema info1) {
			info1.setId(101);
			var data=con.findById(info1.getId()).orElse(null);
			if( data !=null) {
				data.setName("Bella");
				data.setId(102);
				data.setChocalate("Toblemore");
				con.save(data);
				var data1=con.findById(info1.getId()).orElse(null);
				if(data1 !=null) {
					info1.setId(105);
					con.delete(data1);
				}
		}
			return data;
		}
		public void deleteData(UserInfoSchema del) {
			del.setId(102);
			con.delete(del);
			del.setId(103);
			
			con.delete(del);
		}
}
