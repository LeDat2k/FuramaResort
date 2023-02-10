package services;

import models.Customer;

public interface CustomerService extends Service{
    void displayListCustomer();
    void addNewCustomer(Customer customer);
    void editCustomer(Customer customer);

}
