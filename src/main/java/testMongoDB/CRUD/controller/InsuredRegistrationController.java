package testMongoDB.CRUD.controller;

import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testMongoDB.CRUD.model.InsuredRegistration;
import testMongoDB.CRUD.service.InsuredRegistrationService;

@RestController
@RequestMapping("/insuredregistrations")
public class InsuredRegistrationController {

    private final InsuredRegistrationService insuredRegistrationService;

    public InsuredRegistrationController(InsuredRegistrationService insuredRegistrationService) {
        this.insuredRegistrationService = insuredRegistrationService;
    }

    @PostMapping
    public ResponseEntity<InsuredRegistration> createInsuredRegistration(
            @RequestBody InsuredRegistration insuredRegistration) {
        InsuredRegistration createdInsuredRegistration = insuredRegistrationService
                .createInsuredRegistration(insuredRegistration);
        return ResponseEntity
                .status(HttpStatus.SC_CREATED)
                .body(createdInsuredRegistration);
    }

    @GetMapping("/{id}")
    public InsuredRegistration getInsuredRegistration(@PathVariable String id) {
        return insuredRegistrationService.getInsuredRegistrationById(id);
    }

    @PutMapping("/{id}")
    public InsuredRegistration updateInsuredRegistration(@PathVariable String id,
            @RequestBody InsuredRegistration insuredRegistration) {
        return insuredRegistrationService.updateInsuredRegistration(id, insuredRegistration);
    }

    @DeleteMapping("/{id}")
    public void deleteInsuredRegistration(@PathVariable String id) {
        insuredRegistrationService.deleteInsuredRegistrationById(id);
    }
}
