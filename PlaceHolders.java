package java2;
import java.util.Scanner;
public class PlaceHolders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Firstname = scanner.nextLine();
        String Lastname = scanner.nextLine();
        int Years = Integer.parseInt(scanner.nextLine());
        String Town = scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", Firstname, Lastname,Years, Town);
    }
}
