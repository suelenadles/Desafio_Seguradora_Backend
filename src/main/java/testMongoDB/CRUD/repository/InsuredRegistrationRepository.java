package testMongoDB.CRUD.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import testMongoDB.CRUD.model.InsuredRegistration;

public interface InsuredRegistrationRepository extends MongoRepository<InsuredRegistration, String> {

}
