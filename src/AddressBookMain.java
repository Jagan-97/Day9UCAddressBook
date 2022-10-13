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
                    "\n2.Edit person" +
                    "\n3.Delete person" +
                    "\n4.show Address Book" +
                    "\n5.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addressBookMain.addPerson();
                    break;
                case 2:
                    addressBookMain.editPerson();
                    break;
                case 3:
                    addressBookMain.deletePerson();
                    break;
                case 4:
                    addressBookMain.showAddressBook();
                    break;
                case 5:
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

    private void editPerson(){
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        Person person = findPerson(name);
        if (person!= null) {
            System.out.println("Enter City");
            String city = scanner.nextLine();
            System.out.println("Enter Mobile");
            long mobileNumber = Long.parseLong(scanner.nextLine());
            person.setCity(city);
            person.setMobileNumber(mobileNumber);
        } else {
            System.out.println("No Contact found");
        }
    }
    private void showAddressBook(){
        for(int i=0; i <addressBook.size(); i++){
            System.out.println(addressBook.get(i));
        }
    }

    private void deletePerson(){
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        Person person = findPerson(name);
        if (person!= null) {
            System.out.println(String.format("found entry with this name and deleted ", name));
            addressBook.remove(person);
        } else {
            System.out.println("No Contact found");
        }
    }

    private Person findPerson(String name) {
        Person person = null;
        for (int i=0; i < addressBook.size();i++) {
            if(name.equals(addressBook.get(i).getFirstName() )
                    || name.equals(addressBook.get(i).getLastName())){
                person = addressBook.get(i);
                break;
            }
        }
        return person;
    }
}
