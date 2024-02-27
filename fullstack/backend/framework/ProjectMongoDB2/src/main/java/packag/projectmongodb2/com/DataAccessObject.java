package packag.projectmongodb2.com;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataAccessObject extends MongoRepository<ProgramModel, String> {

}
