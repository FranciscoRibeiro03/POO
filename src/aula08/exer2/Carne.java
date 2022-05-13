package aula08.exer2;

public class Carne extends Alimento {

    private VariedadeCarne variedadeCarne;

    public Carne(double proteinas, double calorias, double peso, VariedadeCarne variedadeCarne) {
        super(proteinas, calorias, peso);
        this.variedadeCarne = variedadeCarne;
    }

    public VariedadeCarne getVariedadeCarne() {
        return variedadeCarne;
    }

    public void setVariedadeCarne(VariedadeCarne variedadeCarne) {
        this.variedadeCarne = variedadeCarne;
    }

    @Override
    public String toString() {
        return "Carne{" + "variedadeCarne=" + variedadeCarne + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Carne other = (Carne) obj;
        return super.equals(obj) && this.getVariedadeCarne() == other.getVariedadeCarne();
    }

}
