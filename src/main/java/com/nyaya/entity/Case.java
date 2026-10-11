package com.nyaya.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "cases")
@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true, nullable = false)
    private String caseNumber;

    private String title;

    private String court;
    private String judge;
    private String petitioner;
    private String respondent;
    private LocalDate filingDate;
    private LocalDate judgmentDate;
    private String caseType;
    private String outcome;
    private Integer durationInDays;

    @ElementCollection
    private List<String> legalSections;

    @ElementCollection
    private List<String> citations;

    @Column(columnDefinition = "TEXT")
    private String summary;

    @Column(columnDefinition = "TEXT")
    private String judgmentText;

    private Instant createdAt;
    private Instant updatedAt;
}
