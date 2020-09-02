package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.service.AddressBookImplement;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBookImplement addressBook = new AddressBookImplement();
        int choice = 0;
        do {
            System.out.println("Welcome to address Book Program");
            System.out.println("1.Add contact \n2. Edit a contact \n3. Delete a person \n4. Display the record \n5. Sort the entry \n6. View the address book");
            System.out.println("enter the option");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    addressBook.add();
                    break;
                case 2:
                    System.out.println("Enter person's first name");
                    String name = sc.next();
                    addressBook.edit(name);
                    break;
                case 3:
                    addressBook.delete();
                    break;
                case 4:
                    addressBook.display();
                    break;
                case 5:
                    addressBook.sort();
                    break;
                case 6:
                    addressBook.view();
                    break;
                case 7:
                    System.out.println("enter correct choice");
                    break;
            }
        } while (choice != 5);
    }
}

