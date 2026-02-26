package nimblix.in.HealthCareHub.controller;

import nimblix.in.HealthCareHub.model.Appointment;
import nimblix.in.HealthCareHub.response.AppointmentResponse;
import nimblix.in.HealthCareHub.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
@RequiredArgsConstructor
public class AppointmentController {

    private final AppointmentService appointmentService;

    /**
     * Fetch Patient Appointment History
     * URL: GET /api/patients/{patientId}/appointments
     */
    @GetMapping("/{patientId}/appointments")
    public ResponseEntity<AppointmentResponse<List<Appointment>>> getPatientAppointmentHistory(
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