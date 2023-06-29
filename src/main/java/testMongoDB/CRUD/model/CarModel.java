package testMongoDB.CRUD.model;

import lombok.Data;

@Data
public class CarModel {

    private String modelo;
    private String ano;
    private String placa;
    private String marca;
    private String carroceria;

    public CarModel(String modelo, String ano, String placa, String marca, String carroceria) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.marca = marca;
        this.carroceria = carroceria;
    }
}
