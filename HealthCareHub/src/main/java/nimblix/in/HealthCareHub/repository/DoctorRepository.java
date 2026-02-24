package nimblix.in.HealthCareHub.repository;

import nimblix.in.HealthCareHub.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

 main
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {

    Optional<Doctor> findByEmailId(String emailId);
 main
}
