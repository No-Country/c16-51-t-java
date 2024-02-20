package com.noCountry.medicGuard.repository;

import com.noCountry.medicGuard.domain.model.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAllByName(String data);
    List<Employee> findAllByLastname(String data);
    Optional<Employee> findByEmail(String email);
}
