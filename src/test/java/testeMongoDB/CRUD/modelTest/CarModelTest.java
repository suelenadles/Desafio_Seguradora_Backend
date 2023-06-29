package testeMongoDB.CRUD.modelTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import testMongoDB.CRUD.model.CarModel;

class CarModelTest {

    @Test
    void testCarModel() {

        String modelo = "Corolla";
        String ano = "2021";
        String placa = "ABC123";
        String marca = "Toyota";
        String carroceria = "Sedan";

        CarModel carModel = new CarModel(modelo, ano, placa, marca, carroceria);

        Assertions.assertEquals(modelo, carModel.getModelo());
        Assertions.assertEquals(ano, carModel.getAno());
        Assertions.assertEquals(placa, carModel.getPlaca());
        Assertions.assertEquals(marca, carModel.getMarca());
        Assertions.assertEquals(carroceria, carModel.getCarroceria());
    }
}
