package exextra;

public class Ticket {

    private Festival fest;
    private int n;

    public Ticket(Festival fest, int n) {
        this.fest = fest;
        this.n = n;
    }

    public int getN() { return this.n; }
    public Festival getFest() { return this.fest; }

    public void setN(int n) { this.n = n; }
    public void setFest(Festival fest) { this.fest = fest; }

    @Override
    public String toString() {
        return String.format("Bilhete %-3s: %s", this.getN(), this.getFest());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final Ticket other = (Ticket) obj;
        return this.n == other.getN() && this.fest.equals(other.getFest());

    }
    
}
