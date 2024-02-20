package com.noCountry.medicGuard.domain.mapper;

import com.noCountry.medicGuard.domain.dto.request.*;
import com.noCountry.medicGuard.domain.dto.response.*;
import com.noCountry.medicGuard.domain.model.*;

public interface EmployeeMapper {
    EmployeeDto entityToDto(Employee employee);
    Employee dtoToEntity(EmployeeDto employeeDto);
    Employee dtoToEntity(RequestPostEmployee employeeDto);
}
