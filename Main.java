package Section_12.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        seatCopy.get(20).reserve();
        seatCopy.get(43).reserve();
        seatCopy.get(12).reserve();
        seatCopy.get(30).reserve();
        System.out.println();
        getReservedSeats(seatCopy);   
        
        // List<Seat> newList = new ArrayList<>(theatre.seats.size()+ 1);  // out of bounds exception
        // Collections.copy(newList, theatre.seats);                // no stored elements yet
       
    }

    public static void getReservedSeats(List<Seat> listOfReservedSeats){
        List<String> reservedSeat = new ArrayList<String>();
        System.out.println("  <=======  List of Reserved seats ========>");
          for (Seat seats : listOfReservedSeats){
            if(seats.getReservedStatus() == true){
                reservedSeat.add(seats.getSeatNumber());
            }
        }
        Collections.sort(reservedSeat);
        System.out.println(reservedSeat);
        System.out.println();
    }

    public static void getReservedSeats2(List<Seat> listOfReservedSeats){
      
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
