package com.noCountry.medicGuard.domain.mapper.impl;

import com.noCountry.medicGuard.domain.dto.request.*;
import com.noCountry.medicGuard.domain.dto.response.*;
import com.noCountry.medicGuard.domain.mapper.*;
import com.noCountry.medicGuard.domain.model.*;
import org.springframework.context.annotation.*;

@Configuration
public class EmployeeMapperImpl implements EmployeeMapper {

    Employee employee = new Employee();

    @Override
    public EmployeeDto entityToDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setName(employee.getName());
        employeeDto.setLastname(employee.getLastname());
        employeeDto.setEmail(employee.getEmail());
        //TODO no se si es buena idea pasar el user, hay que verlo
        employeeDto.setUsername(employee.getUsername());
        employeeDto.setRol(employee.getRol());
        employeeDto.setGuardCalendar(employee.getGuardCalendar());
        employeeDto.setProfessionalRegistration(employee.getProfessionalRegistration());
        employeeDto.setProfession(employee.getProfession());
        employeeDto.setIsActive(employee.getIsActive());
        employeeDto.setWeekDayCounter(employee.getWeekDayCounter());
        employeeDto.setWeekendDayCounter(employee.getWeekendDayCounter());
        employeeDto.setHolidayCounter(employee.getHolidayCounter());

        return employeeDto;
    }

    @Override
    public Employee dtoToEntity(EmployeeDto employeeDto) {
        employee.setName(employeeDto.getName());
        employee.setLastname(employeeDto.getLastname());
        employee.setEmail(employeeDto.getEmail());
        employee.setUsername(employeeDto.getUsername());
        employee.setRol(employeeDto.getRol());
        employee.setGuardCalendar(employeeDto.getGuardCalendar());
        employee.setProfessionalRegistration(employeeDto.getProfessionalRegistration());
        employee.setProfession(employeeDto.getProfession());
        employee.setIsActive(employeeDto.getIsActive());
        employee.setWeekDayCounter(employeeDto.getWeekDayCounter());
        employee.setWeekendDayCounter(employeeDto.getWeekendDayCounter());
        employee.setHolidayCounter(employeeDto.getHolidayCounter());

        return employee;
    }

    @Override
    public Employee dtoToEntity(RequestPostEmployee employeeDto) {
        employee.setName(employeeDto.getName());
        employee.setLastname(employeeDto.getLastname());
        employee.setEmail(employeeDto.getEmail());
        employee.setUsername(employeeDto.getUsername());
        employee.setPass(employeeDto.getPassword());
        employee.setRol(employeeDto.getRol());
        employee.setGuardCalendar(employeeDto.getGuardCalendar());
        employee.setProfessionalRegistration(employeeDto.getProfessionalRegistration());
        employee.setProfession(employeeDto.getProfession());
        employee.setIsActive(employeeDto.getIsActive());
        employee.setWeekDayCounter(employeeDto.getWeekDayCounter());
        employee.setWeekendDayCounter(employeeDto.getWeekendDayCounter());
        employee.setHolidayCounter(employeeDto.getHolidayCounter());

        return employee;
    }


}
