package packag.projectmongodb.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Skyliner34")

public class UserInfoSchema {
	
	
	@Id
	private Integer id;
	private	String name;
	private	String chocalate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChocalate() {
		return chocalate;
	}
	public void setChocalate(String chocalate) {
		this.chocalate = chocalate;
	}
		
	}
