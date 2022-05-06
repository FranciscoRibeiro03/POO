package aula07.exer3;

public class Alojamento {

    private String code;
    private String name;
    private String location;
    private double pricePerNight;
    private boolean available;
    private double evaluation;

    public Alojamento(String code, String name, String location, double pricePerNight, boolean available, double evaluation) {
        validateEvaluation(evaluation);
        this.code = code;
        this.name = name;
        this.location = location;
        this.pricePerNight = pricePerNight;
        this.available = available;
        this.evaluation = evaluation;
    }

    private void validateEvaluation(double evaluation) {
        if (evaluation < 0 || evaluation > 10) {
            throw new IllegalArgumentException("Avaliação inválida");
        }
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isAvailable() {
        return available;
    }

    public double getEvaluation() {
        return evaluation;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setEvaluation(double evaluation) {
        validateEvaluation(evaluation);
        this.evaluation = evaluation;
    }

    public void checkIn() {
        this.available = false;
    }

    public void checkOut() {
        this.available = true;
    }

    @Override
    public String toString() {
        return "Alojamento{" + "code=" + code + ", name=" + name + ", location=" + location + ", pricePerNight=" + pricePerNight + ", available=" + available + ", evaluation=" + evaluation + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Alojamento other = (Alojamento) obj;
        return this.getCode() == other.getCode();
    }
    
}
