package com.noCountry.medicGuard.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ADMIN")
public class Admin extends Person{

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(nullable = false)
      private Long idAdmin;

      @OneToMany
      private List<GuardCalendar> guardCalendar = new ArrayList<>();
}
