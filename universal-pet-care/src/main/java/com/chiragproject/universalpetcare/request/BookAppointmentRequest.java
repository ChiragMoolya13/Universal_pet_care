package com.chiragproject.universalpetcare.request;

import com.chiragproject.universalpetcare.model.Appointment;
import com.chiragproject.universalpetcare.model.Pet;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class BookAppointmentRequest {
    private Appointment appointment;
    private List<Pet> pets;

}
