package services;

import models.Employee;

public interface EmployeeService extends Service{

    void displayListEmployees();
    void addNewEmployee(Employee employee);
    void editEmployee(Employee employee);
}
