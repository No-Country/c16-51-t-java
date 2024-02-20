package com.noCountry.medicGuard.domain.model;

import com.noCountry.medicGuard.enumeration.Rol;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Person {

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String lastname;

  @Column(nullable = false, unique = true)
  private String email;

  @Column(nullable = false, unique = true)
  private String username;

  @Column(nullable = false)
  private String pass;

  @Enumerated(EnumType.STRING)
  private Rol rol;
}
