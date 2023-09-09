package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        //super();
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomer (){
        return customerRepository.findAll();

    }

    public void addCustomer(Customer customer){
        customerRepository.save(customer);

    }

    public void deleteCustomer(Integer customerId){
        customerRepository.deleteById(customerId);
    }

    /*public void updateCustomer(String name, Customer customer){
        if(customer.getName() == name || customer.getId() == Id){

        }
        customerRepository.save(customer);
    }*/

}
