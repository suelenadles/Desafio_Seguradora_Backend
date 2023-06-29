package testMongoDB.CRUD.service;

import org.springframework.stereotype.Service;

import testMongoDB.CRUD.model.InsuredRegistration;
import testMongoDB.CRUD.repository.InsuredRegistrationRepository;

@Service
public class InsuredRegistrationService {
    private InsuredRegistrationRepository insuredRegistrationRepository;

    public InsuredRegistrationService(InsuredRegistrationRepository insuredRegistrationRepository) {
        this.insuredRegistrationRepository = insuredRegistrationRepository;
    }

    public InsuredRegistration createInsuredRegistration(InsuredRegistration insuredRegistration) {
        return insuredRegistrationRepository.save(insuredRegistration);
    }

    public InsuredRegistration getInsuredRegistrationById(String id) {
        return insuredRegistrationRepository.findById(id)
                .orElseThrow();
    }

    public InsuredRegistration updateInsuredRegistration(String id, InsuredRegistration insuredRegistration) {
        insuredRegistration.generatedId();
        return insuredRegistrationRepository.save(insuredRegistration);
    }

    public void deleteInsuredRegistrationById(String id) {
        insuredRegistrationRepository.deleteById(id);
    }
}
