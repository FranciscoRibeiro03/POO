package aula08.exer1;

public class AutomovelLigeiro extends Automovel {

    private int capacidadeDaBagageira;

    public AutomovelLigeiro(String matricula, String marca, String modelo, int potenciaCv, int numeroDoQuadro, int capacidadeDaBagageira) {
        super(matricula, marca, modelo, potenciaCv, numeroDoQuadro);
        this.capacidadeDaBagageira = capacidadeDaBagageira;
    }

    public int getCapacidadeDaBagageira() {
        return capacidadeDaBagageira;
    }

    public void setCapacidadeDaBagageira(int capacidadeDaBagageira) {
        this.capacidadeDaBagageira = capacidadeDaBagageira;
    }

    @Override
    public String toString() {
        return "AutomovelLigeiro{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", potenciaCv=" + getPotenciaCv() + ", numeroDoQuadro=" + getNumeroDoQuadro() + ", capacidadeDaBagageira=" + capacidadeDaBagageira + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final AutomovelLigeiro other = (AutomovelLigeiro) obj;
        return super.equals(obj) && this.getCapacidadeDaBagageira() == other.getCapacidadeDaBagageira();
    }
    
}
