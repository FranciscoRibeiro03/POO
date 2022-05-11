package aula08.exer1;

public class Motociclo extends Veiculo {

    private String tipo;

    public Motociclo(String matricula, String marca, String modelo, int potenciaCv, String tipo) {
        super(matricula, marca, modelo, potenciaCv);
        validarTipo(tipo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        validarTipo(tipo);
        this.tipo = tipo;
    }

    private void validarTipo(String tipo) {
        if (!tipo.toLowerCase().equals("desportivo") && !tipo.toLowerCase().equals("estrada")) {
            throw new IllegalArgumentException("Tipo deve ser DESPORTIVO ou ESTRADA");
        }
    }

    @Override
    public String toString() {
        return "Motociclo{" + "matricula=" + getMatricula() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", potenciaCv=" + getPotenciaCv() + ", tipo=" + tipo + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;

        final Motociclo other = (Motociclo) obj;
        return super.equals(obj) && this.getTipo().equals(other.getTipo());
    }
    
}
