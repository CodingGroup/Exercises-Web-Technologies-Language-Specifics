import java.util.Scanner;

public class VariableInHexadecimalFormat {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String number = console.nextLine();
        System.out.println(Integer.decode(number));
    }

}
