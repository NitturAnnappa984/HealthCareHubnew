package nimblix.in.HealthCareHub.controller;
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