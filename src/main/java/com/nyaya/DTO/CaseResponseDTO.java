package com.nyaya.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CaseResponseDTO {

    private UUID id;
    private String caseNumber;
    private String title;
    private String court;
    private String outcome;
    private LocalDate judgmentDate;
}
