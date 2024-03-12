package packag.cityDataBase.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="city_collection")
public class Cities {
	@Id
	private Integer id;
	private String city_name;
	private String mp_name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private int people_count;
	
	
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getMp_name() {
		return mp_name;
	}
	public void setMp_name(String mp_name) {
		this.mp_name = mp_name;
	}
	public int getPeople_count() {
		return people_count;
	}
	public void setPeople_count(int people_count) {
		this.people_count = people_count;
	}
}
