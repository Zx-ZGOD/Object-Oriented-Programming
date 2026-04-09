class RailwayReservation {

    int seats = 2;

    synchronized void bookTicket(String name) {
        if (seats > 0) {
            System.out.println(name + ": Ticket booked successfully");
            seats--;
        } else {
            System.out.println(name + ": No tickets available");
        }
    }
}

class Passenger extends Thread {
    RailwayReservation rr;
    String name;

    Passenger(RailwayReservation rr, String name) {
        this.rr = rr;
        this.name = name;
    }

    public void run() {
        rr.bookTicket(name);
    }

    public static void main(String[] args) {
        RailwayReservation rr = new RailwayReservation();

        Passenger p1 = new Passenger(rr, "User1");
        Passenger p2 = new Passenger(rr, "User2");
        Passenger p3 = new Passenger(rr, "User3");

        p1.start();
        p2.start();
        p3.start();
    }
}