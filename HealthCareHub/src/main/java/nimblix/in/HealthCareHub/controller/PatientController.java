package nimblix.in.HealthCareHub.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import nimblix.in.HealthCareHub.model.Appointment;
import nimblix.in.HealthCareHub.model.Patient;
import nimblix.in.HealthCareHub.repository.PatientRepository;
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