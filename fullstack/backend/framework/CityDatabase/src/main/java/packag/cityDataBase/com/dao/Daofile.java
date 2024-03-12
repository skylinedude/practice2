package packag.cityDataBase.com.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import packag.cityDataBase.com.model.Cities;

public interface Daofile extends MongoRepository<Cities,Integer> {

}
