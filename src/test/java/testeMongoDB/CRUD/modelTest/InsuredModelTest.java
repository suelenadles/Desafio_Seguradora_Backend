package testeMongoDB.CRUD.modelTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import testMongoDB.CRUD.model.InsuredModel;

class InsuredModelTest {

    @Test
    void testInsuredModel() {

        String name = "Luana";
        String cpf = "123456789";
        String telefone = "1234567890";
        String email = "luana@hotmail.com";
        String endereco = "rua zero, 1";

        InsuredModel insuredModel = new InsuredModel(name, cpf, telefone, email, endereco);

        Assertions.assertEquals(name, insuredModel.getName());
        Assertions.assertEquals(cpf, insuredModel.getCpf());
        Assertions.assertEquals(telefone, insuredModel.getTelefone());
        Assertions.assertEquals(email, insuredModel.getEmail());
        Assertions.assertEquals(endereco, insuredModel.getEndereco());
    }
}
