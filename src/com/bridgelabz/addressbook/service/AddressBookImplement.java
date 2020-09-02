package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.model.Person;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBookImplement implements IAddressBook {
    Scanner sc = new Scanner(System.in);
    List<Person> list = new LinkedList<>();

    public void add() {
        System.out.println("Enter your first name:");
        String firstName = sc.next();
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getFirstName().equalsIgnoreCase(firstName)){
                System.out.println("This name is already exist!! please enter another name");
                return;
            }
        }
        System.out.println("Enter your last name");
        String lastName = sc.next();
        System.out.println("Enter your address");
        String address = sc.next();
        System.out.println("Enter your city name");
        String city = sc.next();
        System.out.println("Enter your state name");
        String state = sc.next();
        System.out.println("Enter your zip code");
        long zip = sc.nextLong();
        System.out.println("Enter your phone number");
        long phoneNumber = sc.nextLong();
        Person person = new Person(firstName, lastName, address, city, state, phoneNumber, zip);
        list.add(person);
    }

    public void edit(String firstName) {
        System.out.println("Enter first name  of person:");
        for (int i = 0; i < list.size(); i++) {
            Person person = list.get(i);
            Scanner sc = new Scanner(System.in);

            System.out.println("1.Edit address\n2.Edit city\n3.Edit state\n4.Edit zipCode\n5.Edit phone number");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(person.getFirstName() + "Enter new address:");
                    String address = sc.next();
                    person.setAddress(address);
                    break;
                case 2:
                    System.out.println(person.getFirstName() + "Enter new city:");
                    String city = sc.next();
                    person.setCity(city);
                    break;
                case 3:
                    System.out.println(person.getFirstName() + "Enter new state:");
                    String state = sc.next();
                    person.setState(state);
                    break;
                case 4:
                    System.out.println(person.getFirstName() + "Enter new zipcode:");
                    int zipCode = sc.nextInt();
                    person.setZip(zipCode);
                    break;
                case 5:
                    System.out.println(person.getFirstName() + "Enter new phone number:");
                    long phoneNumber = sc.nextLong();
                    person.setPhoneNumber(phoneNumber);
                    break;
                default:
                    System.out.println("Enter correct choice");
            }
            System.out.println("Editted the entered details successfully");
            break;
        }

    }

    public void delete() {
        System.out.println("Enter first name");
        String firstName = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                Person person = list.get(i);
                list.remove(person);
            }
        }
        System.out.println("Entered entry deleted successfully");
    }

    public void display() {
        for (Person person : list) {
            System.out.println(person);
        }
    }
    public void sort()
    {
        Collections.sort(list,(Firstname1,FirstName2)  -> Firstname1.getFirstName().compareTo(FirstName2.getFirstName()));
        System.out.println(list);
    }
}

