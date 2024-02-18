package com.noCountry.medicGuard.domain.model;


import jakarta.persistence.*;

import java.time.LocalTime;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DAYS_OF_GUARD")
public class DaysOfGuard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idDaysOfGuard;

    private LocalTime startDate;

    private LocalTime endDate;

    private Long guardDuration;

}
