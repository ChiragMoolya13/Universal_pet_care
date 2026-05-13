package com.chiragproject.universalpetcare.repository;

import com.chiragproject.universalpetcare.enums.AppointmentStatus;
import com.chiragproject.universalpetcare.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    Appointment findByAppointmentNo(String appointmentNo);

    boolean existsByVeterinarianIdAndPatientIdAndStatus(Long veterinarianId, Long reviewerId, AppointmentStatus appointmentStatus);

    List<Appointment> findAllByUserId(Long userId);
}
