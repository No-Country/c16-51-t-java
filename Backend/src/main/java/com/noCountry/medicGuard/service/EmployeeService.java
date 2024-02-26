package com.noCountry.medicGuard.service;

import com.noCountry.medicGuard.domain.dto.request.*;
import com.noCountry.medicGuard.domain.dto.response.*;

import java.util.*;

public interface EmployeeService {

    List<EmployeeDto> getEmployeeList(RequestGetEmployee request);
    List<EmployeeDto> getAllEmployeeList();
    List<EmployeeDto> getEmployeeByProfessionalRegistration(RequestGetEmployee request);

    List<EmployeeDto> postEmployee(RequestPostEmployee request);
    List<EmployeeDto> deleteEmployee(Long idEmployee);

    //ToDo buscar empleado por matricula
}
