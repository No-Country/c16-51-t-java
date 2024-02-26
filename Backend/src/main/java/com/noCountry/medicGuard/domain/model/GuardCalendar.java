package com.noCountry.medicGuard.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "GUARD_CALENDAR")
public class GuardCalendar {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_guard_calendar", nullable = false)
  private Long idGuardCalendar;

  @OneToOne
  @JoinColumn(name = "id_employee")
  private Employee employee;

  @OneToMany(mappedBy = "guardCalendar", cascade = CascadeType.ALL, orphanRemoval = true)
  @Column(name = "days_of_guards")
  private List<DayOfGuard> dayOfGuards = new ArrayList<>();

  @OneToMany(mappedBy = "guardCalendar", cascade = CascadeType.ALL, orphanRemoval = true)
  @Column(name = "unavailable_days_of_guards")
  private List<UnavailableDayOfGuard> unavailableDayOfGuards = new ArrayList<>();

  @ManyToOne
  @JoinColumn(name = "id_admin")
  private Admin admin;
}
