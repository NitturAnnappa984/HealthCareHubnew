package nimblix.in.HealthCareHub.service;

 main
import nimblix.in.HealthCareHub.model.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor saveDoctor(Doctor doctor);

    List<Doctor> getAllDoctors();

    Doctor getDoctorById(Long id);

    Doctor updateDoctor(Long id, Doctor doctor);

    void deleteDoctor(Long id);

import nimblix.in.HealthCareHub.request.DoctorRegistrationRequest;
import org.springframework.http.ResponseEntity;

public interface DoctorService {
    String registerDoctor(DoctorRegistrationRequest request);

    ResponseEntity<?> getDoctorDetails(Long doctorId, Long hospitalId);
 main
}

