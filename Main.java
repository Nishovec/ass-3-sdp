public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentAdapter(new PaymentGateway());
        TicketService ticketService= new TicketAdapter(new TicketProvider());
        double ticketPrice = 50.0;
        String eventname = "Concert";
        int ticketQuantity = 2;
        boolean paymentSuccess = paymentService.makePayment(ticketPrice * ticketQuantity);
        boolean ticketPurchaseSuccess = ticketService.purchaseTicket(eventname,ticketQuantity);
        if (paymentSuccess && ticketPurchaseSuccess) {
            System.out.println("Ticket purchased");
        } else {
            System.out.println("Transaction failed");
        }
    }
}
