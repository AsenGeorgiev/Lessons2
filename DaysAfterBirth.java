package java2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysAfterBirth {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        DateTimeFormatter timeformater =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date= scanner.nextLine();
        LocalDate localDate=LocalDate.parse(date,timeformater);
        System.out.println(localDate.plusDays(999).format(timeformater));
    }
}