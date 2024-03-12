package packag.projectmongodb2.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramService {

	@Autowired
	private  DataAccessObject connect;
	
	
	public void addData(ProgramModel user) {
		user.setId(46);
		user.setForest_name("Nagarahole");
		user.setLocation("H.D.Kote");
		user.setAnimal_count(69);
		connect.insert(user);
	}
	public ProgramModel showForest(ProgramModel details) {
		details.setId(45);
		var info=connect.findById(details.getId()).orElse(details);
		details.setId(46);
		var info1=connect.findById(details.getId()).orElse(details);
		return info;
	}
	public ProgramModel updateData(ProgramModel forr) {
		forr.setId(46);
		var data=connect.findById(forr.getId()).orElse(null);
		if(data!=null) {
			data.setId(101);
			data.setAnimal_count(100);
			connect.save(data);
		var data1=connect.findById(forr.getId()).orElse(null);
		if(data1!=null) {
			forr.setId(46);
			connect.delete(forr);
		}
	}
	return data;
}
	public void deleteData(ProgramModel y) {
		y.setId(101);
		y.setAnimal_count(100);
		connect.delete(y);
		
	}
}
