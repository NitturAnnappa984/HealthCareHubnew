package nimblix.in.HealthCareHub.controller;

import nimblix.in.HealthCareHub.model.Appointment;
import nimblix.in.HealthCareHub.service.AppointmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    /**
     * Fetch Patient Appointment History
     * URL: GET /api/patients/{patientId}/appointments
     */
    @GetMapping("/{patientId}/appointments")
    public ResponseEntity<List<Appointment>> getPatientAppointmentHistory(
            @PathVariable Long patientId) {

        List<Appointment> appointmentList =
                appointmentService.getAppointmentHistory(patientId);

        if (appointmentList == null || appointmentList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(appointmentList);
    }
}