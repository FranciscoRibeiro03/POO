package aula08.exer1;

public abstract class Automovel extends Veiculo {

    private int numeroDoQuadro;

    public Automovel(String matricula, String marca, String modelo, int potenciaCv, int numeroDoQuadro) {
        super(matricula, marca, modelo, potenciaCv);
        this.numeroDoQuadro = numeroDoQuadro;
    }

    public int getNumeroDoQuadro() {
        return numeroDoQuadro;
    }

    public void setNumeroDoQuadro(int numeroDoQuadro) {
        this.numeroDoQuadro = numeroDoQuadro;
    }

    @Override
    public String toString() {
        return "Automovel{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", potenciaCv=" + getPotenciaCv() + ", numeroDoQuadro=" + numeroDoQuadro + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Automovel other = (Automovel) obj;
        return super.equals(obj) && this.getNumeroDoQuadro() == other.getNumeroDoQuadro();
        
    }
    
}
