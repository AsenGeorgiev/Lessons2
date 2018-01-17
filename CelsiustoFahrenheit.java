package java2;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double Fahrenheit = a * 1.8 +32;
        System.out.printf("%.2f",+Fahrenheit);
    }
}
