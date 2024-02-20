package com.noCountry.medicGuard.controller;

import com.noCountry.medicGuard.domain.dto.request.*;
import com.noCountry.medicGuard.domain.dto.response.*;
import com.noCountry.medicGuard.service.*;
import com.noCountry.medicGuard.util.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(ControllerConstant.REQUEST_MAPPING)
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(ControllerConstant.GET_CONTROLLER)
    public List<EmployeeDto> getEmployeeList(@RequestBody RequestGetEmployee request) {
        return employeeService.getEmployeeList(request);
    }

    @GetMapping(ControllerConstant.GET_ALL_CONTROLLER)
    public List<EmployeeDto> getAllEmployeeList() {
        return employeeService.getAllEmployeeList();
    }

    @PostMapping(ControllerConstant.POST_CONTROLLER)
    public List<EmployeeDto> postEmployee(@RequestBody RequestPostEmployee request) {
        return employeeService.postEmployee(request);
    }
}
