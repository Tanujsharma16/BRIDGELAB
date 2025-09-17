import java.util.ArrayList;
class Flight {
    int id; String from, to, date; int cap;
    Flight(int id, String from, String to, String date, int cap) {
        this.id=id; this.from=from; this.to=to; this.date=date; this.cap=cap;
    }
}
class Passenger {
    int id; String name;
    Passenger(int id, String name){this.id=id; this.name=name;}
}
class Booking {
    int id, flightId, passengerId;
    Booking(int id,int f,int p){this.id=id; this.flightId=f; this.passengerId=p;}
}
public class  Flightcode{
    static ArrayList<Flight> flights = new ArrayList<>();
    static ArrayList<Passenger> passengers = new ArrayList<>();
    static ArrayList<Booking> bookings = new ArrayList<>();
    static void flightsBooked() {
        System.out.println("Flights bookings:");
        for(Flight f:flights){int c=0; for(Booking b:bookings) if(b.flightId==f.id) c++;
            System.out.println(f.id+": "+c+" booked");}
    }
    static void overbooked() {
        System.out.println("Overbooked flights:");
        for(Flight f:flights){int c=0; for(Booking b:bookings) if(b.flightId==f.id) c++;
            if(c>f.cap) System.out.println(f.id+" overbooked");}
    }
    public static void main(String[] args){
        flights.add(new Flight(1,"Delhi","Mumbai","2025-09-20",2));
        flights.add(new Flight(2,"Delhi","Chennai","2025-09-20",3));
        passengers.add(new Passenger(101,"Alice"));
        passengers.add(new Passenger(102,"Bob"));
        bookings.add(new Booking(1,1,101));
        bookings.add(new Booking(2,1,102));
        bookings.add(new Booking(3,1,101));

        flightsBooked();
        overbooked();
    }
}