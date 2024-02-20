package com.noCountry.medicGuard.util.exception;

public enum EmployeeError {
    ERR0001("El nombre o apellido no coincide con los empleados existentes"),
    ERR0002("No existen empleados"),
    ERR0003("Ya existe un empleado con ese email");

    private String description = null;

    EmployeeError(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
