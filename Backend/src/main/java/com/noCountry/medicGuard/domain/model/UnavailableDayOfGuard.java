package com.noCountry.medicGuard.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "UNAVAILABLE_DAY_OF_GUARD")
public class UnavailableDayOfGuard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_unavailable_day_of_guard", nullable = false)
    private Long idUnavailableDayOfGuard;

    @Column(name = "unavailable_date")
    private LocalDate UnavailableDate;

    @ManyToOne
    @JoinColumn(name = "id_guard_calendar")
    private GuardCalendar guardCalendar;
}
