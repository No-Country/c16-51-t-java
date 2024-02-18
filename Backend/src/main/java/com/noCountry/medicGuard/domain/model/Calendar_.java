package com.noCountry.medicGuard.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
public class Calendar_ {

  @Id
  @GeneratedValue
  @Column(nullable = false)
  private Integer id;

  final Employee employee;

  final DaysGuard daysGuard;
}
