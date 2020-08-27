import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int choice = 0;
        String firstName;
        String lastName;
        String address;
        String city;
        String state;
        int zip;
        long phoneNumber;
        Person information[] = new Person[10];
        while (true) {
            System.out.println("1.Add contact \n2. Edit a contact");
            System.out.println("enter the choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("welcome to address book program");
                    System.out.println("Enter your first name");
                    firstName = sc.next();
                    System.out.println("Enter your last name");
                    lastName = sc.next();
                    System.out.println("Enter your address");
                    address = sc.next();
                    System.out.println("Enter your city name");
                    city = sc.next();
                    System.out.println("Enter your state name");
                    state = sc.next();
                    System.out.println("Enter your zip code");
                    zip = sc.nextInt();
                    System.out.println("Enter your phone number");
                    phoneNumber = sc.nextLong();
                    information[count] = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
                    System.out.println(information[count]);
                    count++;
                    break;
                case 2:
                    System.out.println("enter the first name ");
                    firstName = sc.next();
                    for (int i = 0; i < count; i++) {
                        if (information[i] != null && information[i].getFirstName().equals(firstName)) {
                            System.out.println("1. edit address \n2. edit city \n3. edit state \n4. edit zip \n5. edit phone Number");
                            System.out.println("Enter your choice to edit information:");
                            choice = sc.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.println("enter the one word address location ");
                                    address = sc.next();
                                    information[i].setAddress(address);
                                    break;
                                case 2:
                                    System.out.println("enter the city name");
                                    city = sc.next();
                                    information[i].setCity(city);
                                    break;
                                case 3:
                                    System.out.println("enter the State");
                                    state = sc.next();
                                    information[i].setState(state);
                                    break;
                                case 4:
                                    System.out.println("enter the zip code");
                                    zip = sc.nextInt();
                                    information[i].setZip(zip);
                                    break;
                                case 5:
                                    System.out.println("enter the phone number");
                                    phoneNumber = sc.nextLong();
                                    information[i].setPhoneNumber(phoneNumber);
                                    break;
                            }
                            System.out.println(information[i]);
                        }
                    }
            }
        }
    }
}
