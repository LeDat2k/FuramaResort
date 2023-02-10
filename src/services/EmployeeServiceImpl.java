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
                1,"Dat",new SimpleDateFormat("yyyy-MM-dd").parse("2000-02-03"),true,"025839503","939584930","lephuocdat@gmail.com","Đại học","Giám đốc", 10000
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
        // check if employee doesn't already exists
        System.out.println();
        for (Employee e : employeeList) {
            if (employee.getId() == e.getId()) {
                employeeList.set(employee.getId()-1, employee);
                System.out.println("Updated!!");
                return;
            }
        }
        System.out.println("Employee with ID:" + employee.getId() + " doesn't exists");
    }


}
