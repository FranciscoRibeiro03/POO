package aula08.exer1;

public class Taxi extends AutomovelLigeiro {

    private int nLicenca;

    public Taxi(String matricula, String marca, String modelo, int potenciaCv, int numeroDoQuadro, int capacidadeDaBagageira, int nLicenca) {
        super(matricula, marca, modelo, potenciaCv, numeroDoQuadro, capacidadeDaBagageira);
        this.nLicenca = nLicenca;
    }

    public int getnLicenca() {
        return nLicenca;
    }

    public void setnLicenca(int nLicenca) {
        this.nLicenca = nLicenca;
    }

    @Override
    public String toString() {
        return "Taxi{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", potenciaCv=" + getPotenciaCv() + ", numeroDoQuadro=" + getNumeroDoQuadro() + ", capacidadeDaBagageira=" + getCapacidadeDaBagageira() + ", nLicenca=" + nLicenca + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Taxi other = (Taxi) obj;
        return super.equals(obj) && this.getnLicenca() == other.getnLicenca();
    }
    
}
