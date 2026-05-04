package com.chiragproject.universalpetcare.service.pet;

import com.chiragproject.universalpetcare.model.Pet;

import java.util.List;

public interface IPetService {
    List<Pet> savePetForAppointment(List<Pet> pets);
    Pet updatePet(Pet pet, Long petId);
    void deletePet(Long petId);
    Pet getPetById(Long PetId);
}
