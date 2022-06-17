package exextra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomTickets {

    private TicketManager manager = new TicketManager();
    private Map<Person, ArrayList<Ticket>> peopleTicketsMap = new HashMap<>();

    public void getRandomTicket(Person p) {

        if (!peopleTicketsMap.containsKey(p))
            peopleTicketsMap.put(p, new ArrayList<>());

        ArrayList<Ticket> currList = peopleTicketsMap.get(p);
        if (currList.size() >= 2) return;

        Ticket newTicket = manager.getRandomTicket();
        currList.add(newTicket);

        peopleTicketsMap.replace(p, currList);

    }

    public void listPersons() {
        for (Person p : peopleTicketsMap.keySet()) {

            ArrayList<Ticket> ticketList = peopleTicketsMap.get(p);

            System.out.println(String.format("%s, %s, %s - %s %s %s:", 
                p.getName(), 
                p.getCc(), 
                p.getBirthDate(), 
                ticketList.size(), 
                ticketList.size() == 1 ? "bilhete" : "bilhetes",
                ticketList.size() == 1 ? "atribuído" : "atribuído"));

            for (Ticket t : ticketList) {
                System.out.println(String.format(" - %s", t));
            }

            System.out.println("");

        }
    }

    public void listAvailableTickets() {
        List<Ticket> ticketList = manager.getRemainingTickets();

        System.out.println(String.format("%s bilhetes restantes:", ticketList.size()));

        for (Ticket t : ticketList) {
            System.out.println(String.format(" - %s", t));
        }
    }
    
}
