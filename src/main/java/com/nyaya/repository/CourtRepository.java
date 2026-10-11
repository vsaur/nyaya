package com.nyaya.repository;

import com.nyaya.entity.Court;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourtRepository extends JpaRepository<Court, UUID> {
}
