import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Flight {
    int flightId;
    String source;
    String destination;
    LocalDate date;
    int capacity;

    public Flight(int flightId, String source, String destination, LocalDate date, int capacity) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.capacity = capacity;
    }
}

class Passenger {
    int passengerId;
    String name;

    public Passenger(int passengerId, String name) {
        this.passengerId = passengerId;
        this.name = name;
    }
}

class Booking {
    int bookingId;
    int flightId;
    int passengerId;

    public Booking(int bookingId, int flightId, int passengerId) {
        this.bookingId = bookingId;
        this.flightId = flightId;
        this.passengerId = passengerId;
    }
}

public class FlightReservationSystem {

    private List<Flight> flights = new ArrayList<>();
    private List<Passenger> passengers = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    // Add sample data
    public void loadData() {
        flights.add(new Flight(1, "Delhi", "Mumbai", LocalDate.now().plusDays(3), 2));
        flights.add(new Flight(2, "Delhi", "Chennai", LocalDate.now().plusDays(5), 3));
        flights.add(new Flight(3, "Delhi", "Mumbai", LocalDate.now().plusDays(7), 1));

        passengers.add(new Passenger(1, "Alice"));
        passengers.add(new Passenger(2, "Bob"));
        passengers.add(new Passenger(3, "Charlie"));

        bookings.add(new Booking(1, 1, 1));
        bookings.add(new Booking(2, 1, 2));
        bookings.add(new Booking(3, 3, 3));
        bookings.add(new Booking(4, 3, 1)); // Overbooked
    }

    // 1. List flights with number of passengers booked
    public void listFlightsWithPassengerCount() {
        Map<Integer, Long> bookingCount = bookings.stream()
                .collect(Collectors.groupingBy(b -> b.flightId, Collectors.counting()));

        for (Flight f : flights) {
            long count = bookingCount.getOrDefault(f.flightId, 0L);
            System.out.println("Flight " + f.flightId + " from " + f.source + " to " + f.destination +
                    " on " + f.date + " has " + count + " passengers.");
        }
    }

    // 2. Show flights with zero bookings
    public void showFlightsWithZeroBookings() {
        Set<Integer> bookedFlights = bookings.stream()
                .map(b -> b.flightId)
                .collect(Collectors.toSet());

        flights.stream()
                .filter(f -> !bookedFlights.contains(f.flightId))
                .forEach(f -> System.out.println("Flight " + f.flightId + " has zero bookings."));
    }

    // 3. Passengers who booked more than one flight on the same day
    public void findPassengersMultipleFlightsSameDay() {
        Map<Integer, Map<LocalDate, Long>> passengerDateMap = bookings.stream()
                .collect(Collectors.groupingBy(b -> b.passengerId,
                        Collectors.groupingBy(b -> flights.stream()
                                .filter(f -> f.flightId == b.flightId)
                                .findFirst()
                                .get()
                                .date, Collectors.counting())));

        passengerDateMap.forEach((passengerId, dateMap) -> {
            dateMap.forEach((date, count) -> {
                if (count > 1) {
                    String name = passengers.stream()
                            .filter(p -> p.passengerId == passengerId)
                            .findFirst()
                            .get()
                            .name;
                    System.out.println("Passenger " + name + " booked " + count + " flights on " + date);
                }
            });
        });
    }

    // 4. List flights from Delhi to Mumbai next week
    public void listDelhiToMumbaiNextWeek() {
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusWeeks(1);

        flights.stream()
                .filter(f -> f.source.equals("Delhi") && f.destination.equals("Mumbai")
                        && !f.date.isBefore(today) && !f.date.isAfter(nextWeek))
                .forEach(f -> System.out.println("Flight " + f.flightId + " on " + f.date));
    }

    // 5. Detect overbooked flights
    public void detectOverbookedFlights() {
        Map<Integer, Long> bookingCount = bookings.stream()
                .collect(Collectors.groupingBy(b -> b.flightId, Collectors.counting()));

        flights.stream()
                .filter(f -> bookingCount.getOrDefault(f.flightId, 0L) > f.capacity)
                .forEach(f -> System.out.println("Flight " + f.flightId + " is OVERBOOKED! Capacity: " +
                        f.capacity + ", Booked: " + bookingCount.get(f.flightId)));
    }

    public static void main(String[] args) {
        FlightReservationSystem system = new FlightReservationSystem();
        system.loadData();

        System.out.println("Flights with passenger count:");
        system.listFlightsWithPassengerCount();

        System.out.println("\nFlights with zero bookings:");
        system.showFlightsWithZeroBookings();

        System.out.println("\nPassengers with multiple flights on same day:");
        system.findPassengersMultipleFlightsSameDay();

        System.out.println("\nFlights from Delhi to Mumbai next week:");
        system.listDelhiToMumbaiNextWeek();

        System.out.println("\nOverbooked flights:");
        system.detectOverbookedFlights();
    }
}
