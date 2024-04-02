package POO.Exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = scanner.nextInt();

        System.out.println("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(scanner.next());

        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(scanner.next());









        scanner.close();
    }
}
