package com.nyaya.repository;

import com.nyaya.entity.Case;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CaseRepository extends JpaRepository<Case, UUID> {
}
