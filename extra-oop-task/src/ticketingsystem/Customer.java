package ticketingsystem;

public class Customer {
    private final String name;
    private final int accountNumber;
    private static int idCounter = 1;
    private final int id;

    public Customer(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.id = idCounter++;
    }

    public void buyTicket(Ticket ticket) {
        if (ticket != null && ticket.getStatus() == Status.AVAILABLE) {
            ticket.buyTicket();
        } else {
            System.out.println("Ticket is not available.");
        }
    }

    public void reserveTicket(Ticket ticket) {
        if (ticket != null && ticket.getStatus() == Status.AVAILABLE) {
            ticket.reserveTicket();
        } else {
            System.out.println("Ticket is not available.");
        }
    }

    @Override
    public String toString() {
        return String.format(
                "+------------------------------+%n" +
                        "| Name:       %-16s |%n" +
                        "| Account no: %-16d |%n" +
                        "+------------------------------+",
                this.name, this.accountNumber
        );
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getId() {
        return id;
    }


}
