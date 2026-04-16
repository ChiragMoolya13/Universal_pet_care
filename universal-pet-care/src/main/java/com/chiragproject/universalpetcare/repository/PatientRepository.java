package com.chiragproject.universalpetcare.repository;

import com.chiragproject.universalpetcare.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long>{
}
