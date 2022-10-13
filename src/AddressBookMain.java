import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    private List<Person> addressBook = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        boolean isExit = false;
        AddressBookMain addressBookMain = new AddressBookMain();
        while(!isExit){
            System.out.println("Select Option" +
                    "\n1.Add person" +
                    "\n2.show Address Book" +
                    "\n3.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addressBookMain.addPerson();
                    break;
                case 2:
                    addressBookMain.showAddressBook();
                    break;
                case 3:
                    isExit = true;
                    break;
                default:
                    System.out.println("Please enter valid input");
            }
        }
    }

    private void addPerson(){
        Person person = new Person();
        System.out.println("Enter first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name");
        String lastName=scanner.nextLine();
        System.out.println("Enter city");
        String city=scanner.nextLine();
        System.out.println("Enter mobile number");
        long mobileNumber=Long.parseLong(scanner.nextLine());

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setCity(city);
        person.setMobileNumber(mobileNumber);

        addressBook.add(person);
    }

    private void showAddressBook(){
        for(int i=0; i <addressBook.size(); i++){
            System.out.println(addressBook.get(i));
        }
    }
}
