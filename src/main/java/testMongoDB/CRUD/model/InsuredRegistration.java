package testMongoDB.CRUD.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
public class InsuredRegistration {

    @Id
    private String id;

    @Field("insured")
    private InsuredModel insured;

    @Field("car")
    private CarModel car;

    public InsuredRegistration() {

    }

    public InsuredRegistration(String id, InsuredModel insured, CarModel car) {
        this.id = id;
        this.insured = insured;
        this.car = car;
    }

    public void generatedId() {
        this.id = new ObjectId().toString();
    }

}
