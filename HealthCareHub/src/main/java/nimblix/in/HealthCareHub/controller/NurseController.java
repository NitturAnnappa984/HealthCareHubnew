package nimblix.in.HealthCareHub.controller;

import lombok.RequiredArgsConstructor;
import nimblix.in.HealthCareHub.service.DoctorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/nurse")
@RequiredArgsConstructor
public class NurseController {

    private final DoctorService doctorService;

    @GetMapping("/test")
    public ResponseEntity<String> testApi() {
        return ResponseEntity.ok("Nurse Controller Working Successfully!");
    }
}