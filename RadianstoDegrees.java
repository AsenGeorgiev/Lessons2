package java2;
        import java.util.Scanner;
public class RadianstoDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double Radians = a * 57.29578;
        System.out.printf("%.2f",+Radians);
    }
}
