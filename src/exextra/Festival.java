package exextra;

public class Festival {

    private DateYMD startDate;
    private DateYMD endDate;
    private String name;
    private String location;

    public Festival(DateYMD startDate, DateYMD endDate, String name, String location) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
        this.location = location;
    }

    public DateYMD getStartDate() { return this.startDate; }
    public DateYMD getEndDate() { return this.endDate; }
    public String getName() { return this.name; }
    public String getLocation() { return this.location; }

    public void setStartDate(DateYMD startDate) { this.startDate = startDate; }    
    public void setEndDate(DateYMD endDate) { this.endDate = endDate; }
    public void setName(String name) { this.name = name; }
    public void setLocation(String location) { this.location = location; }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final Festival other = (Festival) obj;
        return this.startDate.equals(other.getStartDate()) && this.endDate.equals(other.getEndDate()) && this.name.equals(other.getName()) && this.location.equals(other.getLocation());

    }
    
}
