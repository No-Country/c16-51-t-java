package com.noCountry.medicGuard.domain.model;

import com.noCountry.medicGuard.enumerations.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Persona {
    @Id
    @GeneratedValue
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private String usuario;
    private String password;

    @Enumerated(EnumType.STRING)
    private Rol rol;

}
