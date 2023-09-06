package Section_12.BinarySearch;
import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;

public class Theatre {
    private final String theatreName;
    public List<Seat> seats = new ArrayList<Seat>();  

    public Theatre(String theatreName, int numRows, int seatsPerRow){
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);
        for(char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName (){
        return theatreName;
    }

    public boolean reserveSeat (String seatNumber) {
        int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
            System.out.print(".");
            int mid = (low + high) / 2;
            Seat midValue = seats.get(mid);
            int comparableValue1 = midValue.getSeatNumber().compareTo(seatNumber);

            if (comparableValue1 < 0){
                low = mid + 1;
            } else if ( comparableValue1 > 0){
                high = mid -1;
            } else {
                return seats.get(mid).reserve();
            }      
            }
         System.out.println("There is no seat " + seatNumber); 
         return false;

        // Seat3 requestSeat = new Seat3(seatNumber);
        // int foundSeat = Collections.binarySearch(seats, requestSeat, null);
        
        // if(foundSeat >= 0){
        //     return seats.get(foundSeat).reserve();
        // } else {
        //     System.out.println("there is no seat " + requestSeat);
        //     return false;
        // }
   
       
    }

    public boolean cancelReservedSeat(String seatNumber){
        Seat requestSeat = null;
        for(Seat seat : seats){
            if(seat.getSeatNumber().equals(seatNumber)){
                requestSeat = seat;
                break;
            }
        }

        if(requestSeat == null){
            System.out.println("there is no seat " + seatNumber);
            return false;

        }
        return requestSeat.cancel();
    }

    public void getSeats(){
        for(Seat seat : seats){
            System.out.println(seat.getSeatNumber());
        }
    }
    
}