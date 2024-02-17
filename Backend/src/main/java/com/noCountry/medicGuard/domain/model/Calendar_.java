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

    private final Employee employee;

    // Do a pull from the developer when the DiasDeGuardia entity has been created
    private final DiasDeGuardia diasDeGuardia;

}
