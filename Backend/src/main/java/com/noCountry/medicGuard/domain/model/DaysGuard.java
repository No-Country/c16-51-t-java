package com.noCountry.medicGuard.domain.model;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DaysGuard {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;

    private LocalTime startDate;

    private LocalTime endDate;

    private Long guardDuration;

}
