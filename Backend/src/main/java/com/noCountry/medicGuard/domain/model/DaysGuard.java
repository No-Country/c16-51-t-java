package com.noCountry.medicGuard.domain.model;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DaysGuard {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;

    private LocalDateTime  startDate;
    private LocalDateTime  endDate;
    private LocalDateTime guardDuration;

}
