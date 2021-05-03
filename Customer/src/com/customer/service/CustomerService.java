package com.customer.service;

import com.customer.dal.CustomerDB;
import com.customer.model.Customer;

import java.io.IOException;
import java.util.Map;

public class CustomerService {
    CustomerDB cdb = new CustomerDB();
    public void addCustomer(Customer customer) throws Exception {
        cdb.addFile(customer);
        cdb.saveFile();
    }

    public Customer find(String phone){
        return CustomerDB.customerList.get(phone);
    }

    public void loadDB() throws IOException {
        cdb.readFile();
    }

    public void display(){
        int count = 0;
        for (Map.Entry<String, Customer> entry : CustomerDB.customerList.entrySet()){
            System.out.println(entry.getValue().toString());
            System.out.println("All cusomer" + count++);
        }
        
    }
}
