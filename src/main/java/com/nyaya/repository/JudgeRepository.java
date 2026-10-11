package com.nyaya.repository;

import com.nyaya.entity.Judge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JudgeRepository extends JpaRepository<Judge, UUID> {
}
