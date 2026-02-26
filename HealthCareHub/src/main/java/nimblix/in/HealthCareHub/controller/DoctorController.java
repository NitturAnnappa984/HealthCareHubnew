package nimblix.in.HealthCareHub.controller;

import nimblix.in.HealthCareHub.request.DoctorRegistrationRequest;
import nimblix.in.HealthCareHub.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctor")
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorService doctorService;

    @PostMapping("/register")
    public ResponseEntity<String> registerDoctor(@RequestBody DoctorRegistrationRequest request) {
        return ResponseEntity.ok(doctorService.registerDoctor(request));
    }

    @GetMapping("/getDoctorDetails")
    public ResponseEntity<?> getDoctorDetails(
            @RequestParam Long doctorId,
            @RequestParam Long hospitalId) {
        return doctorService.getDoctorDetails(doctorId, hospitalId);
    }
}