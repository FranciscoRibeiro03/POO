package aula07.exer3;

public class Apartamento extends Alojamento {

    private int numeroQuartos;

    public Apartamento(String code, String name, String location, double pricePerNight, boolean available, double evaluation, int numeroQuartos) {
        super(code, name, location, pricePerNight, available, evaluation);
        this.numeroQuartos = numeroQuartos;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }
    
}
