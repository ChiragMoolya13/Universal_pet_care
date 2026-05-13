package com.chiragproject.universalpetcare.service.appointment;

import com.chiragproject.universalpetcare.dto.AppointmentDto;
import com.chiragproject.universalpetcare.model.Appointment;
import com.chiragproject.universalpetcare.request.AppointmentUpdateRequest;
import com.chiragproject.universalpetcare.request.BookAppointmentRequest;

import java.util.List;

public interface IAppointmentService {
    Appointment createAppointment(BookAppointmentRequest appointment, Long sender, Long recipient);
    List<Appointment> getAllAppointments();
    Appointment updateAppointment(Long id, AppointmentUpdateRequest request);

    void deleteAppointment(Long id);
    Appointment getAppointmentById(Long id);
    Appointment getAppointmentByNo(String appointmentNo);

    List<AppointmentDto> getUserAppointments(Long userId);
}
