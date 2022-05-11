package aula08.exer1;

public abstract class Veiculo implements KmPercorridosInterface {

    private String matricula;
    private String marca;
    private String modelo;
    private int potenciaCv;

    private int ultimoTrajeto = 0;
    private int distanciaTotal = 0;

    public Veiculo(String matricula, String marca, String modelo, int potenciaCv) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potenciaCv = potenciaCv;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    public void trajeto(int quilometros) {
        System.out.println("O veículo " + this.getMatricula() + " percorreu " + quilometros + " quilômetros.");
        this.ultimoTrajeto = quilometros;
        this.distanciaTotal += quilometros;
    }

    public int ultimoTrajeto() {
        return this.ultimoTrajeto;
    }

    public int distanciaTotal() {
        return this.distanciaTotal;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", potenciaCv=" + potenciaCv + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Veiculo other = (Veiculo) obj;
        return this.getMatricula().equals(other.getMatricula()) &&
            this.getMarca().equals(other.getMarca()) &&
            this.getModelo().equals(other.getModelo()) &&
            this.getPotenciaCv() == other.getPotenciaCv();
    }

}
