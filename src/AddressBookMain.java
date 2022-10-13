import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Person> addressBook = new ArrayList<>();
    public static void main(String args[]){
        createContact();
    }

    public static void createContact(){
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


}
