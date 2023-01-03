package com.csi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

    @Id
    private int empId;

    private String empName;

    private String empAddress;

    private long empContact;

    private Date empDOB;

    private double empSalary;

    private String empEmailid;

    private String empPassword;

}
