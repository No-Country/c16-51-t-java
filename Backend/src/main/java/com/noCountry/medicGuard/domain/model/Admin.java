package com.noCountry.medicGuard.domain.model;

import com.noCountry.medicGuard.enumeration.Rol;
import jakarta.persistence.Entity;

@Entity
public class Admin extends Person{

    public Admin(Integer id, String name, String lastname, String email, String user, String pass, Rol rol, Calendar_ calendar) {
            super(id, name, lastname, email, user, pass, rol);
    }
}
