package java2;
import java.text.Format;
import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double area = a*h/2;
        System.out.println("Triangle area =");
        System.out.printf("%.2f", + area);
    }
}
