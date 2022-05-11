package aula08.exer1;

public class PesadoPassageiros extends Pesado {

    private int nMaxPassageiros;

    public PesadoPassageiros(String matricula, String marca, String modelo, int potenciaCv, int numeroDoQuadro, int peso, int nMaxPassageiros) {
        super(matricula, marca, modelo, potenciaCv, numeroDoQuadro, peso);
        this.nMaxPassageiros = nMaxPassageiros;
    }

    public int getnMaxPassageiros() {
        return nMaxPassageiros;
    }

    public void setnMaxPassageiros(int nMaxPassageiros) {
        this.nMaxPassageiros = nMaxPassageiros;
    }

    @Override
    public String toString() {
        return "PesadoPassageiros{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", potenciaCv=" + getPotenciaCv() + ", numeroDoQuadro=" + getNumeroDoQuadro() + ", peso=" + getPeso() + ", nMaxPassageiros=" + nMaxPassageiros + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final PesadoPassageiros other = (PesadoPassageiros) obj;
        return super.equals(obj) && this.getnMaxPassageiros() == other.getnMaxPassageiros();
    }

}
