package nimblix.in.HealthCareHub.controller;
import nimblix.in.HealthCareHub.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nurse")
class NurseController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/test")
    public String testApi() {
        return "Nurse Controller Working Successfully!";
    }
}


