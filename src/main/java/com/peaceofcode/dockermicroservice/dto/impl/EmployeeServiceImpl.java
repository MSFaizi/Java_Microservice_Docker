package com.peaceofcode.dockermicroservice.dto.impl;

import com.peaceofcode.dockermicroservice.dto.EmployeeDto;
import com.peaceofcode.dockermicroservice.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<EmployeeDto> employeeData;

    public EmployeeServiceImpl() {
        employeeData = new ArrayList<>();
        EmployeeDto dto1 = new EmployeeDto();
        dto1.setId(1L);
        dto1.setName("Shamim");
        dto1.setEmail("test1@gmail.com");
        dto1.setDept("IT");

        EmployeeDto dto2 = new EmployeeDto();
        dto2.setId(2L);
        dto2.setName("Irfat");
        dto2.setEmail("test2@gmail.com");
        dto2.setDept("Finance");

        employeeData.add(dto1);
        employeeData.add(dto2);
    }

    @Override
    public EmployeeDto getEmployee(Long id) {

        return employeeData.stream().filter((emp) -> emp.getId() == id).findAny().get();
    }
}
