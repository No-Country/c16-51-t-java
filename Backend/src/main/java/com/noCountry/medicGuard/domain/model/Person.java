package com.noCountry.medicGuard.domain.model;

import com.noCountry.medicGuard.enumeration.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

  @Id
  @GeneratedValue
  @Column(nullable = false)
  private Integer id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String lastname;

  @Column(nullable = false, unique = true)
  private String email;

  @Column(nullable = false, unique = true)
  private String user;

  @Column(nullable = false)
  private String pass;

  @Enumerated(EnumType.STRING)
  private Rol rol;
}
