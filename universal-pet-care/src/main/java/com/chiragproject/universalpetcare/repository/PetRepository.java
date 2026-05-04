package com.chiragproject.universalpetcare.repository;

import com.chiragproject.universalpetcare.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {

}
