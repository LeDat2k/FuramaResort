package services;

import models.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService {
    static ArrayList<Employee> employeeList = new ArrayList<Employee>();
    static {
        try {
            Employee employee = new Employee(
                    1,"Dat",new SimpleDateFormat("yyyy-MM-dd").parse("2020-02-03"),true,"025839503","939584930","lephuocdat@gmail.com","cao dang","quan ly", 10000
            );
            employeeList.add(employee);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void displayListEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNewEmployee(Employee employee) {
        employeeList.add(employee);
    }
    @Override
    public void editEmployee(Employee employee) {
        // check if employee already exists
        if (!employeeList.contains(employee.getId())) return;

    }


}
