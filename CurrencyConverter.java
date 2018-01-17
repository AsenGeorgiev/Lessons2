package java2;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double BGN = 1,EUR = 1.95583,USD = 1.79549, GBP = 2.53405, a;
        a = Double.parseDouble(scanner.nextLine());
        String b,c;
        b = scanner.nextLine();
        c = scanner.nextLine();

        switch (b){
            case "BGN":
                BGN = a;
                break;
            case "EUR":
                BGN = EUR*a;
                break;
            case "USD":
                BGN = USD*a;
                break;
            case "GBP":
                BGN = GBP*a;
                break;
        }
        switch (c) {
            case "USD":
                System.out.printf("%.2f",BGN/USD);
                System.out.print(" USD");
                break;
            case "EUR":
                System.out.printf("%.2f",BGN/EUR);
                System.out.print(" EUR");
                break;
            case "GBP":
                System.out.printf("%.2f",BGN/GBP);
                System.out.print(" GBP");
                break;
            case "BGN":
                System.out.printf("%.2f",BGN/1);
                System.out.print(" BGN");
                break;
        }
    }
}