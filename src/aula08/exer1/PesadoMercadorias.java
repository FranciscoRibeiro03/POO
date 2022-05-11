package aula08.exer1;

public class PesadoMercadorias extends Pesado {

    private int cargaMaxima;

    public PesadoMercadorias(String matricula, String marca, String modelo, int potenciaCv, int numeroDoQuadro, int peso, int cargaMaxima) {
        super(matricula, marca, modelo, potenciaCv, numeroDoQuadro, peso);
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public String toString() {
        return "PesadoMercadorias{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", potenciaCv=" + getPotenciaCv() + ", numeroDoQuadro=" + getNumeroDoQuadro() + ", peso=" + getPeso() + ", cargaMaxima=" + cargaMaxima + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final PesadoMercadorias other = (PesadoMercadorias) obj;
        return super.equals(obj) && this.getCargaMaxima() == other.getCargaMaxima();
    }
    
}
