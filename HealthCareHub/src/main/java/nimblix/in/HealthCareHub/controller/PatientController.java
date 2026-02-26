package nimblix.in.HealthCareHub.controller;

import lombok.RequiredArgsConstructor;
import nimblix.in.HealthCareHub.service.AppointmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import nimblix.in.HealthCareHub.model.Appointment;
import nimblix.in.HealthCareHub.response.AppointmentResponse;

@RestController
@RequestMapping("/api/patient")
@RequiredArgsConstructor
public class PatientController {

    private final AppointmentService appointmentService;

    @GetMapping("/appointments/{patientId}")
    public ResponseEntity<AppointmentResponse<List<Appointment>>> getAppointmentHistory(
            @PathVariable Long patientId) {

        List<Appointment> appointmentList =
                appointmentService.getPatientAppointmentHistory(patientId);

        if (appointmentList == null || appointmentList.isEmpty()) {
            return ResponseEntity.status(204)
                    .body(AppointmentResponse.empty());
        }

        return ResponseEntity.ok(AppointmentResponse.success(appointmentList));
    }
}