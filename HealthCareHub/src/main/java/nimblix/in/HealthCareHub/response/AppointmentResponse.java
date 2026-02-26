package nimblix.in.HealthCareHub.response;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import java.util.List;
import nimblix.in.HealthCareHub.model.Appointment;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentResponse<T> {

    private int statusCode;
    private String message;
    private boolean success;
    private T data;

    // ✅ Success - appointments found
    public static AppointmentResponse<List<Appointment>> success(List<Appointment> appointments) {
        return AppointmentResponse.<List<Appointment>>builder()
                .statusCode(200)
                .message("Appointment history fetched successfully")
                .success(true)
                .data(appointments)
                .build();
    }

    // ✅ Empty - no appointments found for patient
    public static AppointmentResponse<List<Appointment>> empty() {
        return AppointmentResponse.<List<Appointment>>builder()
                .statusCode(204)
                .message("No appointment history found for this patient")
                .success(false)
                .data(null)
                .build();
    }

    // ✅ Error - patient not found
    public static AppointmentResponse<List<Appointment>> notFound() {
        return AppointmentResponse.<List<Appointment>>builder()
                .statusCode(404)
                .message("Patient not found")
                .success(false)
                .data(null)
                .build();
    }
}