package packag.projectmongodb2.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramService {

	@Autowired
	private  DataAccessObject connect;
	
	
	public void addData(ProgramModel user) {
		user.setForest_name("kabini");
		user.setLocation("H.D.Kote");
		user.setAnimal_count(100);
		connect.insert(user);
	}
}
