package com.noCountry.medicGuard.domain.model;


import jakarta.persistence.*;

import java.time.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DAYS_OF_GUARD")
public class DayOfGuard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer idDayOfGuard;

    @Column(name = "guard_date")
    private LocalDate guardDate;

    @ManyToOne
    @JoinColumn(name = "id_guard_calendar")
    private GuardCalendar guardCalendar;
}
