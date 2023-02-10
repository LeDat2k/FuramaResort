package controllers;

import models.Customer;
import models.Employee;
import services.CustomerServiceImpl;
import services.EmployeeServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FuramaController {
    public FuramaController() {
    }

    private void employeeManagement() {
        do {
            System.out.println(
                    "1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Edit employee\n" +
                    "4.Return main menu\n" +
                    "---");
            Scanner choice = new Scanner(System.in);
            switch (Integer.parseInt(choice.nextLine())) {
                case 1: continue;
                case 2: continue;
                case 3: continue;
                case 4: return;
                default:
                    System.out.println("Invalid\n");
            }
        } while (true);
    }

    public void displayMenu(){
        do {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Managerment");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            Scanner choice = new Scanner(System.in);
            switch (Integer.parseInt(choice.nextLine())) {
                case 1: {
                    employeeManagement();
                    continue;
                }
                case 2: {
                    System.out.println("Welcome");
                    continue;
                }
                case 3: {
                    System.out.println("Welcome");
                    continue;
                }
                case 4: {
                    System.out.println("Welcome");
                    continue;
                }
                case 5: {
                    System.out.println("Welcome");
                    continue;
                }
                case 6: {
                    return;
                }
                default:
                    System.out.println("Invalid");
            }
        } while (true);
    }

    public static void main(String[] args) throws ParseException {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();


    }
}
