package packag.projectmongodb.com.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import packag.projectmongodb.com.model.UserInfoSchema;

public interface UserConnectSchemaDb extends MongoRepository<UserInfoSchema, Integer> {

}
