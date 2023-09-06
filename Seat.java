package Section_12.BinarySearch;

public class Seat implements Comparable<Seat>{
    private final String seatNumber;
    private boolean reserved = false;
   

    public Seat(String seatNumber){
       
        this.seatNumber = seatNumber;
    }

    @Override
    public int compareTo(Seat seat_Object){
        return this.seatNumber.compareToIgnoreCase(seat_Object.getSeatNumber());
    }

    public String getSeatNumber(){
        return seatNumber;
    }

    public boolean getReservedStatus(){
        return reserved;
    }
    
    public boolean reserve(){
        if(!this.reserved) {
            this.reserved = true;
            System.out.println("Seat " + seatNumber + " reserved");
            return true;
        } else if(this.reserved) {
           
            System.out.println("Cannot Reserve Seat " + seatNumber + " , Seat is already reserved.");
        }
        return false;
    }

    public boolean cancel(){
        if(this.reserved){
            this.reserved = false;
            System.out.println("Reservation of seat " + seatNumber + " cancelled");
        } 
            
        
        return false;
    }
}
