public class TicketAdapter implements TicketService {
    private TicketProvider ticketProvider;

    public TicketAdapter(TicketProvider ticketProvider) {
        this.ticketProvider = ticketProvider;
    }
    @Override
    public boolean purchaseTicket(String eventname, int quantity) {
        return ticketProvider.buyTicket(eventname, quantity);
    }

}
