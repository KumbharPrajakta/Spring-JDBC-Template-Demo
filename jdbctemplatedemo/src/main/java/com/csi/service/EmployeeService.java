package com.csi.service;

import com.csi.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee signUp(Employee employee);

    public boolean signIn(String empEmailId, String empPassword);

    public List<Employee> getAllData();

    public Employee update(int empId,Employee employee);

    public Employee getDataById(int empId);

    public List<Employee> getDataByName(String empName);

    public Employee getDataByEmailId(String empEmailId);

    public Employee getDataByContact(long empContact);

    public List<Employee> getDataByUsingAnyInput(String input);

    public List<Employee> sortById();

    public List<Employee> sortByName();

    public List<Employee> sortEmailId();

    public List<Employee> sortByContact();

    public List<Employee> sortBySalary();

    public List<Employee> sortByDOB();

    public List<Employee> filterBySalary(double empSalary);

    public boolean isEligibleForLoan(double empSalary);

    public Employee fetchSecondLargestSalary();

    public void deleteById(int empId);

    public void deleteAll();
}
