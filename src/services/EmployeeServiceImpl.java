package services;

import models.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService {
    static ArrayList<Employee> employeeList = new ArrayList<Employee>();
    static {
        try {
            employeeList.add(
                new Employee(
                    1,"Le",new SimpleDateFormat("yyyy-MM-dd").parse("2000-02-03"),true,"025839503","939584930","lephuocdat@gmail.com","Đại học","Giám đốc", 10000
                )
            );
            employeeList.add(
                new Employee(
                    2,"Phuoc",new SimpleDateFormat("yyyy-MM-dd").parse("2000-06-23"),true,"0953343533","939584930","ledat@gmail.com",
                    "đại học","giám đốc", 10000
                )
            );
            employeeList.add(
                new Employee(
                    3,"Dat",new SimpleDateFormat("yyyy-MM-dd").parse("2000-06-23"),true,"0953343533","939584930","ledat@gmail.com",
                    "đại học","giám đốc", 10000
                )
            );
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
        for (Employee e : employeeList) {
            if (e.getId() == employee.getId()) {
                System.out.println("Employ ID: " + e.getId() + " already exists");
                return;
            }
        }
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
