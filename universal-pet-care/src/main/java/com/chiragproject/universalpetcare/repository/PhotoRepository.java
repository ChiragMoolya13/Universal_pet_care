package com.chiragproject.universalpetcare.repository;

import com.chiragproject.universalpetcare.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
}
