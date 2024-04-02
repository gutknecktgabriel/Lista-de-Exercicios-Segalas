package POO.Exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("Room number: ");
        int number = scanner.nextInt();

        System.out.printf("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(scanner.next());

        System.out.printf("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(scanner.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out dat must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation " + reservation);

            System.out.println();
            System.out.println("Enter data update the reservation");

            System.out.printf("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scanner.next());

            System.out.printf("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scanner.next());

            Date now = new Date();
            if (checkIn.before(now) || checkOut.before(now)) {
                System.out.println("Error in reservation: Reservation dates for update for update must be future dates");
                System.out.println("Reservation " + reservation);
            } else if (!checkOut.after(checkIn)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            } else {
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation " + reservation);
            }
        }


        scanner.close();
    }
}
