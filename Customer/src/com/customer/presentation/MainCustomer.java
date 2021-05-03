package com.customer.presentation;

import com.customer.model.Customer;
import com.customer.service.CustomerService;

import java.io.IOException;
import java.util.Scanner;

public class MainCustomer {
    public static void main(String[] args) throws InterruptedException {
        CustomerService service = new CustomerService();
        try {
            service.loadDB();
        }catch (IOException e){
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            createdMenu();
            choice = sc.nextInt();
            switch (choice){
                case 1 :
                    try {
                        addCustomer();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    findCustomer();
                    break;
                case 3:
                    findCustomerInfo();
                    break;
                case 4:
                    allInfo();
                    break;
                case 5:
                    increaseBill();
                    break;
                case 0:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Again!!!");

            }
        }while (choice != 0);
    }

    public static void addCustomer() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name");
        String name = sc.nextLine();
        System.out.println("Address: ");
        String address = sc.nextLine();
        System.out.println("Phone number");
        String phone = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Gender: ");
        String gender = sc.nextLine();


        Customer customer = new Customer(name, address, phone, email, gender);
        CustomerService service = new CustomerService();
        service.addCustomer(customer);
        System.out.println("You just add a new customer: " + customer.getName());
        System.out.println("Continue");
        System.out.println("====================================");

    }
    /*
    find customer from name to gender
     */
    public static void findCustomer() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input phone number: ");
        String pn = sc.nextLine();
        CustomerService service = new CustomerService();
        service.find(pn);
        if (service.find(pn) == null){
            System.out.println("Not found");
            System.out.println("Continue");
            System.out.println("====================================");
        } else {
            Thread thread = new Thread();
            System.out.println("Searching...");
            thread.start();
            Thread.sleep(1500);
            System.out.println(service.find(pn).toStringnotAll());
            System.out.println("Continue");
            System.out.println("====================================");
        }
    }
    /*
    find customer info from name to order
     */
    public static void findCustomerInfo() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input phone number: ");
        String pn = sc.nextLine();
        CustomerService service = new CustomerService();
        service.find(pn);
        if (service.find(pn) == null){
            System.out.println("Not found");System.out.println("Continue");
            System.out.println("====================================");
        } else {
            Thread thread = new Thread();
            System.out.println("Searching...");
            thread.start();
            Thread.sleep(1500);
            System.out.println(service.find(pn).toString());System.out.println("Continue");
            System.out.println("====================================");
        }
    }
    /*
    display all customer info
     */
    public static void allInfo(){
        CustomerService service = new CustomerService();
        service.display();
        System.out.println("Continue");
        System.out.println("====================================");
    }

    public static void increaseBill(){
        Scanner sc = new Scanner(System.in);
        CustomerService service = new CustomerService();
        System.out.println("input phone you want to increase");
        String phone = sc.nextLine();
        if (service.find(phone) == null){
            System.out.println("Not found");
        }else {
            service.find(phone).setOrder(service.find(phone).getOrder() + 1);
            System.out.println("Continue");
            System.out.println("====================================");
        }
    }

    public static void createdMenu(){
        System.out.println("1. Add new customer");
        System.out.println("2. Find customer");
        System.out.println("3. Find customer's info");
        System.out.println("4. Display all customer info");
        System.out.println("5. Add bill ");
        System.out.println("0. Exit");
    }
}
