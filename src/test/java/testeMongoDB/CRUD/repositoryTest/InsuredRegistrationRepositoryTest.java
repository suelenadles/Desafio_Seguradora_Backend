package testeMongoDB.CRUD.repositoryTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import testMongoDB.CRUD.CrudApplication;
import testMongoDB.CRUD.model.InsuredModel;
import testMongoDB.CRUD.model.InsuredRegistration;
import testMongoDB.CRUD.repository.InsuredRegistrationRepository;

@SpringBootTest(classes = CrudApplication.class)
public class InsuredRegistrationRepositoryTest {

    @Autowired
    private InsuredRegistrationRepository repository;

    @Test
    public void testSaveInsuredRegistration() {
        InsuredModel insured = new InsuredModel("luana", "12345678", "85825923", "luana.eduarda2014@hotmail.com",
                "rua zero, 1");

        InsuredRegistration insuredRegistration = new InsuredRegistration();
        insuredRegistration.setInsured(insured);

        InsuredRegistration savedInsuredRegistration = repository.save(insuredRegistration);

        Assertions.assertNotNull(savedInsuredRegistration.getId());

    }
}
