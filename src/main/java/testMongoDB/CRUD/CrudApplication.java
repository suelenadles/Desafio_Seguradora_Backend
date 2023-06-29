package testMongoDB.CRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import testMongoDB.CRUD.repository.InsuredRegistrationRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = InsuredRegistrationRepository.class)
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

}
