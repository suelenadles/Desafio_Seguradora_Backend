package testeMongoDB.CRUD.serviceTest;

import org.bson.types.ObjectId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import testMongoDB.CRUD.model.InsuredRegistration;
import testMongoDB.CRUD.repository.InsuredRegistrationRepository;
import testMongoDB.CRUD.service.InsuredRegistrationService;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class InsuredRegistrationServiceTest {

    private InsuredRegistrationService insuredRegistrationService;
    private InsuredRegistrationRepository insuredRegistrationRepository;

    @BeforeEach
    public void setup() {
        insuredRegistrationRepository = Mockito.mock(InsuredRegistrationRepository.class);
        insuredRegistrationService = new InsuredRegistrationService(insuredRegistrationRepository);
    }

    @Test
    public void testCreateInsuredRegistration() {

        InsuredRegistration insuredRegistration = new InsuredRegistration();
        when(insuredRegistrationRepository.save(any(InsuredRegistration.class))).thenReturn(insuredRegistration);

        InsuredRegistration savedInsuredRegistration = insuredRegistrationService
                .createInsuredRegistration(insuredRegistration);

        Assertions.assertEquals(insuredRegistration, savedInsuredRegistration);

    }

    @Test
    public void testGetInsuredRegistrationById() {

        String id = new ObjectId().toString();
        InsuredRegistration insuredRegistration = new InsuredRegistration();
        when(insuredRegistrationRepository.findById(id)).thenReturn(Optional.of(insuredRegistration));

        InsuredRegistration retrievedInsuredRegistration = insuredRegistrationService.getInsuredRegistrationById(id);

        Assertions.assertEquals(insuredRegistration, retrievedInsuredRegistration);
    }

    @Test
    public void testUpdateInsuredRegistration() {

        String id = new ObjectId().toString();
        InsuredRegistration insuredRegistration = new InsuredRegistration();
        when(insuredRegistrationRepository.save(any(InsuredRegistration.class))).thenReturn(insuredRegistration);

        InsuredRegistration updatedInsuredRegistration = insuredRegistrationService.updateInsuredRegistration(id,
                insuredRegistration);

        Assertions.assertEquals(insuredRegistration, updatedInsuredRegistration);

    }

    @Test
    public void testDeleteInsuredRegistrationById() {

        String id = new ObjectId().toString();

        Assertions.assertDoesNotThrow(() -> insuredRegistrationService.deleteInsuredRegistrationById(id));
    }

}
