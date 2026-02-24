package nimblix.in.HealthCareHub.controller;
import nimblix.in.HealthCareHub.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

 main
@RestController
@RequestMapping("/nurse")
class NurseController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/test")
    public String testApi() {
        return "Nurse Controller Working Successfully!";
    }

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/nurse")
@RequiredArgsConstructor
public class NurseController {

 main
}


