package com.nyaya.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CaseRequestDTO {

    private String caseNumber;
    private String title;
    private String court;
    private String judge;
    private String petitioner;
    private String respondent;
    private LocalDate filingDate;
    private LocalDate judgmentDate;
    private String caseType;
    private String summary;
    private String judgmentText;
}
