package packag.projectmongodb2.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@Autowired
	private ProgramService service;
	
	@GetMapping("/forests")
	public String forestdb(ProgramModel user1) {
		service.addData(user1);
		return "data added";
	}
	@GetMapping("/forest-info")
	public ProgramModel showdata(ProgramModel x) {
		return service.showForest(x);
	}
	@GetMapping("/forest-update")
	public ProgramModel updatingData(ProgramModel xx) {
		var data1=service.updateData(xx);
		return data1;
	}
	@GetMapping("/forest-delete")
	public String deletingData(ProgramModel del) {
		service.deleteData(del);
		return "deleted";
	}
}
