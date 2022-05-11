package aula08.exer1;

public class AutomovelLigeiroEletrico extends AutomovelLigeiro implements VeiculoEletrico {

    private int autonomia_maxima;
    private int carga = 100;

    public AutomovelLigeiroEletrico(String matricula, String marca, String modelo, int potenciaCv, int numeroDoQuadro, int capacidadeDaBagageira, int autonomia, int carga) {
        super(matricula, marca, modelo, potenciaCv, numeroDoQuadro, capacidadeDaBagageira);
        this.autonomia_maxima = autonomia;
        this.carga = carga;
    }

    public AutomovelLigeiroEletrico(String matricula, String marca, String modelo, int potenciaCv, int numeroDoQuadro, int capacidadeDaBagageira, int autonomia) {
        super(matricula, marca, modelo, potenciaCv, numeroDoQuadro, capacidadeDaBagageira);
        this.autonomia_maxima = autonomia;
    }

    public int autonomiaMaxima() {
        return this.autonomia_maxima;
    }

    public int autonomia() {
        return this.autonomia_maxima * carga/100;
    }

    public void carregar(int percentagem) {
        this.carga += percentagem;
        if (this.carga > 100) this.carga = 100;
    }

    public int getCarga() {
        return this.carga;
    }

    @Override
    public String toString() {
        return "AutomovelLigeiroEletrico{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", potenciaCv=" + getPotenciaCv() + ", numeroDoQuadro=" + getNumeroDoQuadro() + ", capacidadeDaBagageira=" + getCapacidadeDaBagageira() + ", autonomia_maxima=" + autonomia_maxima + ", carga=" + carga + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final AutomovelLigeiroEletrico other = (AutomovelLigeiroEletrico) obj;
        return super.equals(obj) && this.getCarga() == other.getCarga() && this.autonomiaMaxima() == other.autonomiaMaxima();
    }
    
}
