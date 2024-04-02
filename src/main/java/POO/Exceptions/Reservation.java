package POO.Exceptions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkin;
    private Date checkOut;


    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Reservation(Integer roomNumber, Date checkin, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkOut = checkOut;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    public long duration(){
        long diff = checkOut.getTime() - checkin.getTime();
        TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkin, Date checkOut){
        this.checkin = checkin;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "Room "
                +roomNumber
                +", check-in: "
                +sdf.format(checkin)
                +", check-out: "
                +sdf.format(checkOut)
                +", "
                +duration()
                +" nights";
    }
}
