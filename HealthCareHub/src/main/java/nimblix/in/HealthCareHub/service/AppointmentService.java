package nimblix.in.HealthCareHub.service;

import nimblix.in.HealthCareHub.model.Appointment;

import java.util.List;

public interface AppointmentService {

    List<Appointment> getPatientAppointmentHistory(Long patientId);

    List<Appointment> getAppointmentHistory(Long patientId);
}

