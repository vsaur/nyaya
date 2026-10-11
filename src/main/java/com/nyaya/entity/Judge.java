package com.nyaya.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "judges")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Judge {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String court;

    @Column(nullable = false)
    private Integer totalCases;

    private Double convictionRate;

    private Double settlementRate;

    private Integer averageDuration;
    private Instant createdAt;
}
