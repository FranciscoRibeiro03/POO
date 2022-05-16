package aula08.exer2;

public class Peixe extends Alimento {
    
    private TipoPeixe tipoPeixe;

    public Peixe(TipoPeixe tipoPeixe, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.tipoPeixe = tipoPeixe;
    }

    public TipoPeixe getTipoPeixe() {
        return tipoPeixe;
    }

    public void setTipoPeixe(TipoPeixe tipoPeixe) {
        this.tipoPeixe = tipoPeixe;
    }

    @Override
    public String toString() {
        return "Peixe " + this.getTipoPeixe() + ", Proteinas " + this.getProteinas() + ", calorias " + this.getCalorias() + ", Peso " + this.getPeso();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Peixe other = (Peixe) obj;
        return super.equals(obj) && this.getTipoPeixe() == other.getTipoPeixe();
    }

}
