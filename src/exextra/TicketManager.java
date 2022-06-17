package exextra;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketManager {

    private List<Ticket> tickets;

    public TicketManager() {
        this.tickets = new ArrayList<>();
        try {
            this.init();
        } catch (FileNotFoundException e) {
            System.out.println("Lista_festivais.txt não encontrado.");
            System.exit(1);
        }
    }

    private void init() throws FileNotFoundException {

        Scanner sc = new Scanner(new FileReader("./src/exextra/Lista_festivais.txt"));
        sc.nextLine();

        while (sc.hasNextLine()) {

            String[] line = sc.nextLine().split("\t");
            
            int startDateDay = Integer.valueOf(line[0].split("-")[0]);
            int startDateMonth = Integer.valueOf(line[0].split("-")[1]);
            int startDateYear = Integer.valueOf(line[0].split("-")[2]);
            DateYMD startDate = new DateYMD(startDateDay, startDateMonth, startDateYear);

            int endDateDay = Integer.valueOf(line[1].split("-")[0]);
            int endDateMonth = Integer.valueOf(line[1].split("-")[1]);
            int endDateYear = Integer.valueOf(line[1].split("-")[2]);
            DateYMD endDate = new DateYMD(endDateDay, endDateMonth, endDateYear);

            Festival fest = new Festival(startDate, endDate, line[2], line[3]);

            int nTickets = Integer.valueOf(line[4]);

            for (int i = 0; i < nTickets; i++) {
                Ticket ticket = new Ticket(fest, i+1);
                tickets.add(ticket);
            }

        }
            
    }

    public Ticket getRandomTicket() {
        int randomIndex = (int) (Math.random() * tickets.size());
        Ticket t = tickets.get(randomIndex);
        tickets.remove(randomIndex);
        return t;
    }

    public List<Ticket> getRemainingTickets() {
        return this.tickets;
    }
    
}
