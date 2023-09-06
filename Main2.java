package Section_12.BinarySearch;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Seat> seatCopy = new ArrayList<>(theatre.seats);

        System.out.println();

        Collections.shuffle(seatCopy);
        System.out.println("Printing shuffled seatCopy");
        printList(seatCopy); 
        System.out.println();

        sortList(seatCopy);
        System.out.println("Printing sorted SeatCopy ");
        printList(seatCopy);

        System.out.println();
        System.out.println("Printing theatre.seats");
        printList(theatre.seats);

        Seat minSeat = Collections.min(seatCopy);
        Seat MaxSeat = Collections.max(seatCopy);
        System.out.println("Minimun Seat = " + minSeat.getSeatNumber());
        System.out.println("Maximum Seat = " + MaxSeat.getSeatNumber());
       
    }
    
    public static void getReservedSeats(List<Seat> listOfReservedSeats){
        System.out.println("  <=======  List of Reserved seats ========>");
          for (Seat seats : listOfReservedSeats){
            if(seats.getReservedStatus() == true){
                System.out.print(seats.getSeatNumber() + " ");
            }
        }
        System.out.println();
    }

    public static void printList(List<Seat> listOfSeats) {
        System.out.println();
        System.out.println("List of seats in the Theatre");
        System.out.println("====================================================");
        for(Seat seat : listOfSeats){
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("====================================================");
    }

    public static void sortList(List<? extends Seat> list){
        for(int  i = 0; i < list.size()-1; i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i).compareTo( list.get(j) ) > 0 ) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
