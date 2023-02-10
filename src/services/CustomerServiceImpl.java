package services;

import models.Customer;
import models.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

public class CustomerServiceImpl implements CustomerService{
    static LinkedList<Customer> customerList = new LinkedList<Customer>();
    static {
        try {
            customerList.add(
                new Customer(
                    1,"Le",new SimpleDateFormat("yyyy-MM-dd").parse("2000-02-03"),true,"025839503","939584930","lephuocdat@gmail.com",
                    "Diamond", "Hue"
                )
            );
        customerList.add(
            new Customer(
                2,"Phuoc",new SimpleDateFormat("yyyy-MM-dd").parse("2000-06-23"),true,"0953343533","939584930","ledat@gmail.com",
                "Platinium","Quang Ngai"
            )
        );
        customerList.add(
            new Customer(
                3,"Dat",new SimpleDateFormat("yyyy-MM-dd").parse("2000-06-23"),true,"0953343533","939584930","ledat@gmail.com",
                "Silver","Nghe An"
            )
        );
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void displayListCustomer() {
        for (Customer customer : customerList ) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNewCustomer(Customer customer) {
        for (Customer cus : customerList) {
            if (cus.getId() == customer.getId()) {
                System.out.println("Customer ID:" + cus.getId() + " already exists");
                return;
            }
        }
        customerList.add(customer);
    }

    @Override
    public void editCustomer(Customer customer) {
        // check if employee doesn't already exists
        System.out.println();
        for (Customer c : customerList) {
            if (customer.getId() == c.getId()) {
                customerList.set(customer.getId()-1, customer);
                System.out.println("Updated!!");
                return;
            }
        }
        System.out.println("Customer with ID:" + customer.getId() + " doesn't exists");
    }

}
