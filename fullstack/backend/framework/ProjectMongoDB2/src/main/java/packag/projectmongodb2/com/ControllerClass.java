package packag.projectmongodb2.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@Autowired
	private ProgramService service;
	
	@GetMapping("/forest")
	public String forestdb(ProgramModel user1) {
		service.addData(user1);
		return "data added";
	}
}
