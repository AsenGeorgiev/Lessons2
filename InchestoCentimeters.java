package java2;
import java.util.Scanner;
public class InchestoCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double Inch = a * 2.54;
        System.out.println(Inch);
    }
}

