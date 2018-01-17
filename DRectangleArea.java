package java2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class DRectangleArea {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.######");
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double W = Math.max(x1, x2) - Math.min(x1, x2);
        double H = Math.max(y1, y2) - Math.min(y1, y2);
        double area = W * H;
        double perimeter = 2 * (W + H);
        System.out.println("Area =" + area);
        System.out.println("Perimeter =" + perimeter);

    }
}