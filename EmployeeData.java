import java.math.BigInteger;
import java.util.Scanner;

public class EmployeeData {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String firstName = console.nextLine();
        String lastName = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        String gender = console.nextLine();
        Long ID = Long.parseLong(console.nextLine());
        BigInteger employeeNumber =console.nextBigInteger();

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Personal ID: "+ID);
        System.out.println("Unique Employee number: "+employeeNumber);
    }
}
