class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void bookTicket(String newSeat, double newPrice) {
        seatNumber = newSeat;
        price = newPrice;
    }

    void display() {
        System.out.println("Movie: " + movieName + ", Seat: " + seatNumber + ", Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception", "A10", 300);
        ticket.display();
        ticket.bookTicket("B15", 350);
        ticket.display();
    }
}
