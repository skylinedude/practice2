package packag.projectmongodb2.com;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="forest")

public class ProgramModel {
	private String forest_name;
	private String location;
	private int animal_count;
	public String getForest_name() {
		return forest_name;
	}
	public void setForest_name(String forest_name) {
		this.forest_name = forest_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getAnimal_count() {
		return animal_count;
	}
	public void setAnimal_count(int animal_count) {
		this.animal_count = animal_count;
	}
}

