package ticketingsystem;

import java.util.*;

public class TicketSystem {
    private final Map<Integer, Ticket> ticketsWithIds = new LinkedHashMap<>();
    private final Map<Integer, Customer> customersWithIds = new LinkedHashMap<>();

    public void addTicket(Type type, int price) {
        Ticket ticket = new Ticket(type, price);
        ticketsWithIds.put(ticket.getId(), ticket);
    }

    public void removeTicket(int id) {
        ticketsWithIds.remove(id);
    }

    public Ticket getTicketById(int id) {
        return ticketsWithIds.get(id);
    }

    public int availableTickets(Type type) {
        int numberOfAvailableTickets = 0;
        for (Ticket ticket : ticketsWithIds.values()) {
            if (ticket.getType() == type && ticket.getStatus() == Status.AVAILABLE) {
                numberOfAvailableTickets++;
            }
        }
        return numberOfAvailableTickets;
    }

    public void addCustomer(String name, int accountNumber) {
        Customer customer = new Customer(name, accountNumber);
        customersWithIds.put(customer.getId(), customer);
    }

    public void removeCustomer(int id) {
        customersWithIds.remove(id);
    }

    public Customer getCustomerById(int id) {
        return customersWithIds.get(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("=== TICKET SYSTEM DATA ===\n\n");

        sb.append("--- CUSTOMERS ---\n");
        if (customersWithIds.isEmpty()) {
            sb.append("No registered customers.\n");
        } else {
            for (Map.Entry<Integer, Customer> entry : customersWithIds.entrySet()) {
                sb.append("Customer ID: ").append(entry.getKey()).append("\n");
                sb.append(entry.getValue().toString()).append("\n");
            }
        }
        sb.append("\n");

        sb.append("--- TICKETS ---\n");
        if (ticketsWithIds.isEmpty()) {
            sb.append("No tickets in the system.\n");
        } else {
            for (Map.Entry<Integer, Ticket> entry : ticketsWithIds.entrySet()) {
                sb.append("Ticket ID: ").append(entry.getKey()).append("\n");
                sb.append(entry.getValue().toString()).append("\n");
            }
        }

        return sb.toString();
    }

}
