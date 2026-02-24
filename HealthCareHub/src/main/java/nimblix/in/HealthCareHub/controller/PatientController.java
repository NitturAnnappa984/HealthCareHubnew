package nimblix.in.HealthCareHub.controller;
main
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import nimblix.in.HealthCareHub.service.AppointmentService;

@RestController
@RequestMapping("/api/patient")
@RequiredArgsConstructor
public class PatientController {
    private final AppointmentService appointmentService;

    @GetMapping("/appointments/{patientId}")
    public ResponseEntity<?> getAppointmentHistory(@PathVariable Long patientId) {
        return ResponseEntity.ok(appointmentService.getPatientAppointmentHistory(patientId));
    }
}


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/patient")
@RequiredArgsConstructor
public class PatientController {
}
 main
