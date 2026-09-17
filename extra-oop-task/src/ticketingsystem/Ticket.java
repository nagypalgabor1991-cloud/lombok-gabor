package ticketingsystem;

public class Ticket {
    private Type type;
    private int price;
    private Status status;
    private static int idCounter = 1;
    private final int id;

    public Ticket(Type type, int price) {
        this.type = type;
        this.price = price;
        this.status = Status.AVAILABLE;
        this.id = idCounter++;
    }

    public void reserveTicket() {
        this.status = Status.RESERVED;
    }

    public void buyTicket() {
        this.status = Status.SOLD;
    }

    @Override
    public String toString() {
        return String.format(
                "+------------------------------+%n" +
                        "| Type:       %-16s |%n" +
                        "| Price:      %-16d |%n" +
                        "| State:      %-16s |%n" +
                        "+------------------------------+",
                this.type, this.price, this.status
        );
    }

    public Type getType() {
        return type;
    }

    public Status getStatus() {
        return status;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
