package testeMongoDB.CRUD.controllerTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import testMongoDB.CRUD.controller.InsuredRegistrationController;
import testMongoDB.CRUD.model.InsuredRegistration;
import testMongoDB.CRUD.service.InsuredRegistrationService;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.bson.types.ObjectId;

public class InsuredRegistrationControllerTest {

    private InsuredRegistrationController insuredRegistrationController;
    private InsuredRegistrationService insuredRegistrationService;

    @BeforeEach
    public void setup() {
        insuredRegistrationService = Mockito.mock(InsuredRegistrationService.class);
        insuredRegistrationController = new InsuredRegistrationController(insuredRegistrationService);
    }

    @Test
    public void testCreateInsuredRegistration() {

        InsuredRegistration insuredRegistration = new InsuredRegistration();
        InsuredRegistration createdInsuredRegistration = new InsuredRegistration();
        when(insuredRegistrationService.createInsuredRegistration(any(InsuredRegistration.class)))
                .thenReturn(createdInsuredRegistration);

        ResponseEntity<InsuredRegistration> response = insuredRegistrationController
                .createInsuredRegistration(insuredRegistration);

        Assertions.assertEquals(HttpStatus.CREATED, response.getStatusCode());
        Assertions.assertEquals(createdInsuredRegistration, response.getBody());

    }

    @Test
    public void testGetInsuredRegistration() {

        String id = new ObjectId().toString();
        InsuredRegistration insuredRegistration = new InsuredRegistration();
        when(insuredRegistrationService.getInsuredRegistrationById(id)).thenReturn(insuredRegistration);

        InsuredRegistration result = insuredRegistrationController.getInsuredRegistration(id);

        Assertions.assertEquals(insuredRegistration, result);

    }

    @Test
    public void testUpdateInsuredRegistration() {

        String id = new ObjectId().toString();
        InsuredRegistration insuredRegistration = new InsuredRegistration();
        InsuredRegistration updatedInsuredRegistration = new InsuredRegistration();
        when(insuredRegistrationService.updateInsuredRegistration(id, insuredRegistration))
                .thenReturn(updatedInsuredRegistration);

        InsuredRegistration result = insuredRegistrationController.updateInsuredRegistration(id, insuredRegistration);

        Assertions.assertEquals(updatedInsuredRegistration, result);

    }

    @Test
    public void testDeleteInsuredRegistration() {

        String id = new ObjectId().toString();

        Assertions.assertDoesNotThrow(() -> insuredRegistrationController.deleteInsuredRegistration(id));

    }

}
