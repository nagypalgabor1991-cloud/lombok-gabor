package ticketingsystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TicketSystemTest {

    @Test
    void shouldAddTicket() {
        //given
        TicketSystem ticketSystem = new TicketSystem();
        //when
        ticketSystem.addTicket(Type.VIP, 55000);
        Ticket ticket = ticketSystem.getTicketById(1);
        //then
        assertEquals(Type.VIP, ticket.getType());
        assertEquals(55000, ticket.getPrice());
        assertEquals(Status.AVAILABLE, ticket.getStatus());
    }

    @Test
    void shouldRemoveTicket() {
        //given
        TicketSystem ticketSystem = new TicketSystem();
        ticketSystem.addTicket(Type.VIP, 55000);
        //when
        ticketSystem.removeTicket(1);
        // then
        assertNull(ticketSystem.getTicketById(1));
    }

    @Test
    void shouldCountAvailableTicketsByType() {
        //given
        TicketSystem ticketSystem = new TicketSystem();
        ticketSystem.addTicket(Type.VIP, 55000);
        ticketSystem.addTicket(Type.VIP, 55000);
        ticketSystem.addTicket(Type.STANDING_TICKET, 25000);
        ticketSystem.addTicket(Type.SEAT, 35000);
        //when, then
        assertEquals(2, ticketSystem.availableTickets(Type.VIP));
        assertEquals(1, ticketSystem.availableTickets(Type.STANDING_TICKET));
        assertEquals(1, ticketSystem.availableTickets(Type.SEAT));
    }

    @Test
    void shouldAddCustomer() {
        //given
        TicketSystem ticketSystem = new TicketSystem();
        //when
        ticketSystem.addCustomer("Lee", 123);
        Customer customer = ticketSystem.getCustomerById(1);
        //then
        assertEquals("Lee", customer.getName());
        assertEquals(123, customer.getAccountNumber());
    }

    @Test
    void shouldRemoveCustomer() {
        //given
        TicketSystem ticketSystem = new TicketSystem();
        ticketSystem.addCustomer("Lee", 123);
        //when
        ticketSystem.removeCustomer(1);
        // then
        assertNull(ticketSystem.getCustomerById(1));
    }


}
