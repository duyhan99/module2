package com.customer.dal;

import com.customer.model.Customer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CustomerDB {
    public static Map<String, Customer> customerList;
    public static int count;
    static {
        customerList = new HashMap<>();
    }

    public void saveFile()throws Exception{
        File file = new File("Customer.csv");
        if (!file.exists()){
            file.createNewFile();
        }
//        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
        for (Map.Entry<String, Customer> entry : customerList.entrySet()){
            bos.write(entry.getValue().toStringCSV().getBytes());
        }
        bos.flush();
        bos.close();
    }

    public void readFile() throws IOException {
        File file = new File("Customer.csv");
        if (!file.exists()){
            file.createNewFile();
        }
        BufferedReader br = new BufferedReader(new FileReader("Customer.csv"));
        String line;
        while ((line = br.readLine()) != null){
            String[] arr =line.split(",");
            Customer customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], Integer.parseInt(arr[5]));
            addFile(customer);
        }
    }

    public void addFile(Customer customer){
        customerList.put(customer.getPhoneNumber(), customer);
    }
}
