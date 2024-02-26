package com.noCountry.medicGuard.service.impl;

import com.noCountry.medicGuard.domain.dto.request.*;
import com.noCountry.medicGuard.domain.dto.response.*;
import com.noCountry.medicGuard.domain.mapper.*;
import com.noCountry.medicGuard.domain.model.*;
import com.noCountry.medicGuard.repository.*;
import com.noCountry.medicGuard.service.*;
import com.noCountry.medicGuard.util.exception.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final static String NEW_EMPLOYEE_MESSAGE = "Nuevo empleado creado";
    private final static String DELETE_EMPLOYEE_MESSAGE = "Empleado eliminado";

    private final EmployeeRepository employeeRepository;
    private final ExceptionErrorBuilder exceptionErrorBuilder;
    private final EmployeeMapper employeeMapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, ExceptionErrorBuilder exceptionErrorBuilder,
                               EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.exceptionErrorBuilder = exceptionErrorBuilder;
        this.employeeMapper = employeeMapper;
    }

    @Override
    public List<EmployeeDto> getEmployeeList(RequestGetEmployee request) {
        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        try{
            Objects.requireNonNull(request.getData());

            List<Employee> employeeList = employeeRepository.findAllByName(request.getData());

            if (employeeList.isEmpty()) {
                employeeList = employeeRepository.findAllByLastname(request.getData());

                if (employeeList.isEmpty()) {
                    return setErrorEmployee(employeeDtoList, 1);
                }
            }

            return setEmployeeList(employeeDtoList, employeeList);
        } catch (Exception e) {
            return setExceptionEmployee(e, employeeDtoList);
        }
    }

    @Override
    public List<EmployeeDto> getEmployeeByProfessionalRegistration(RequestGetEmployee request) {
        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        try {
            Objects.requireNonNull(request.getData());

            List<Employee> employeeList = employeeRepository.findAllByProfessionalRegistration(request.getData());

            if (employeeList.isEmpty()) {
                return setErrorEmployee(employeeDtoList, 4);
            }

            return setEmployeeList(employeeDtoList, employeeList);

        } catch (Exception e) {
            return setExceptionEmployee(e, employeeDtoList);
        }
    }

    @Override
    public List<EmployeeDto> getAllEmployeeList() {
        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        try {
            List<Employee> employeeList = employeeRepository.findAll();

            if (employeeList.isEmpty()) {
                return setErrorEmployee(employeeDtoList, 2);
            }

            return setEmployeeList(employeeDtoList, employeeList);

        } catch (Exception e) {
            return setExceptionEmployee(e, employeeDtoList);
        }
    }

    @Override
    public List<EmployeeDto> postEmployee(RequestPostEmployee request) {
        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        try {
            Objects.requireNonNull(request.getName());
            Objects.requireNonNull(request.getLastname());
            Objects.requireNonNull(request.getEmail());

            Optional<Employee> employeeExistence = employeeRepository.findByEmail(request.getEmail());

            if (employeeExistence.isPresent()) {
                return setErrorEmployee(employeeDtoList, 3);
            }

            return createEmployee(employeeDtoList, request);

        } catch (Exception e) {
            return setExceptionEmployee(e, employeeDtoList);
        }
    }

    @Override
    public List<EmployeeDto> deleteEmployee(Long idEmployee) {
        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        try {
            Objects.requireNonNull(idEmployee);

            employeeRepository.deleteById(idEmployee);

            EmployeeDto savedEmployee = new EmployeeDto();
            savedEmployee.setMessage(DELETE_EMPLOYEE_MESSAGE);
            employeeDtoList.add(savedEmployee);

            return employeeDtoList;

        } catch (Exception e) {
            return setExceptionEmployee(e, employeeDtoList);
        }
    }

    @Override
    public List<EmployeeDto> updateEmployee(RequestPutEmployee request) {

    }

    private List<EmployeeDto> setErrorEmployee(List<EmployeeDto> employeeDtoList, int errorNum) {
        EmployeeDto employeeDto = new EmployeeDto();
        switch (errorNum) {
            case 1 ->
                    exceptionErrorBuilder.setEmployeeErrorMessage(EmployeeError.ERR0001.getDescription(), employeeDto);
            case 2 ->
                    exceptionErrorBuilder.setEmployeeErrorMessage(EmployeeError.ERR0002.getDescription(), employeeDto);
            case 3 ->
                    exceptionErrorBuilder.setEmployeeErrorMessage(EmployeeError.ERR0003.getDescription(), employeeDto);
            case 4 ->
                    exceptionErrorBuilder.setEmployeeErrorMessage(EmployeeError.ERR0004.getDescription(), employeeDto);
        }

        employeeDtoList.add(employeeDto);
        return employeeDtoList;
    }

    private List<EmployeeDto> setExceptionEmployee(Exception e, List<EmployeeDto> employeeDtoList) {
        EmployeeDto employeeDto = new EmployeeDto();
        exceptionErrorBuilder.setEmployeeExceptionMessage(e, employeeDto);
        employeeDtoList.add(employeeDto);
        return employeeDtoList;
    }

    private List<EmployeeDto> setEmployeeList(List<EmployeeDto> employeeDtoList, List<Employee> employeeList) {
        employeeList.stream()
                .map(employeeMapper::entityToDto)
                .forEach(employeeDtoList::add);

        return employeeDtoList;

    }

    private List<EmployeeDto> createEmployee(List<EmployeeDto> employeeDtoList, RequestPostEmployee request) {
        try {
            Employee saveEmployee = employeeRepository.save(employeeMapper.dtoToEntity(request));

            EmployeeDto savedEmployee = new EmployeeDto();
            savedEmployee.setMessage(NEW_EMPLOYEE_MESSAGE);
            employeeDtoList.add(savedEmployee);

            return employeeDtoList;

        } catch (Exception e) {
            return setExceptionEmployee(e, employeeDtoList);
        }

    }
}
