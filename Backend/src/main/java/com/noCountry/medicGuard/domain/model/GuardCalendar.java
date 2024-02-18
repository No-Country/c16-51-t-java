package com.noCountry.medicGuard.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "GUARD_CALENDAR")
public class GuardCalendar {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private Long idGuardCalendar;

  @OneToOne
  private Employee employee;

  @OneToMany
  private List<DaysOfGuard> daysOfGuards = new ArrayList<>();
}
