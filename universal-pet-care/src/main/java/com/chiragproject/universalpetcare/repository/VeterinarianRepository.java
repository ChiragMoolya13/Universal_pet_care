package com.chiragproject.universalpetcare.repository;

import com.chiragproject.universalpetcare.model.Veterinarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarianRepository extends JpaRepository<Veterinarian,Long> {
}
