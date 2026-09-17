package ticketingsystem;

public class Main {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();

        ticketSystem.addTicket(Type.SEAT, 20000);
        ticketSystem.addTicket(Type.SEAT, 20000);
        ticketSystem.addTicket(Type.VIP, 50000);
        ticketSystem.addTicket(Type.VIP, 100000);
        ticketSystem.addTicket(Type.STANDING_TICKET, 5000);

        ticketSystem.addCustomer("Lee", 123456789);
        ticketSystem.addCustomer("Paul", 123456710);

        ticketSystem.removeTicket(4);

        Customer lee = ticketSystem.getCustomerById(1);
        Customer paul = ticketSystem.getCustomerById(2);

        Ticket seatTicket = ticketSystem.getTicketById(1);
        Ticket vipTicket = ticketSystem.getTicketById(3);

        lee.buyTicket(vipTicket);
        paul.reserveTicket(seatTicket);

        System.out.println("Available seat tickets: " + ticketSystem.availableTickets(Type.SEAT));
        System.out.println("Available vip tickets: " + ticketSystem.availableTickets(Type.VIP));
        System.out.println("Available standing tickets: " + ticketSystem.availableTickets(Type.STANDING_TICKET));
        System.out.println(ticketSystem);

    }
}
