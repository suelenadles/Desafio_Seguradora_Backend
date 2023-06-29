package testeMongoDB.CRUD.modelTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import testMongoDB.CRUD.model.CarModel;
import testMongoDB.CRUD.model.InsuredModel;
import testMongoDB.CRUD.model.InsuredRegistration;

class InsuredRegistrationTest {

    private InsuredRegistration insuredRegistration;
    private InsuredModel insuredModel;
    private CarModel carModel;

    @BeforeEach
    void setUp() {
        insuredModel = new InsuredModel("John Doe", "123456789", "1234567890", "johndoe@example.com",
                "123 Main Street");
        carModel = new CarModel("X6", "2023", "placateste", "BMW", "suv");
        insuredRegistration = new InsuredRegistration("1", insuredModel, carModel);
    }

    @Test
    void testGetId() {

        String expectedId = "1";

        String actualId = insuredRegistration.getId();

        Assertions.assertEquals(expectedId, actualId);
    }

    @Test
    void testGeneratedId() {

        insuredRegistration.generatedId();
        String generatedId = insuredRegistration.getId();

        Assertions.assertNotNull(generatedId);
    }

    @Test
    void testGetInsured() {

        InsuredModel actualInsured = insuredRegistration.getInsured();

        Assertions.assertEquals(insuredModel, actualInsured);
    }

    @Test
    void testGetCar() {

        CarModel actualCar = insuredRegistration.getCar();

        Assertions.assertEquals(carModel, actualCar);
    }
}
