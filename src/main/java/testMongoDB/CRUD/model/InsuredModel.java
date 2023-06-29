package testMongoDB.CRUD.model;

import lombok.Data;

@Data
public class InsuredModel {

    private String name;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;

    public InsuredModel(String name, String cpf, String telefone, String email, String endereco) {
        this.name = name;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
}
