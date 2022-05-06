package aula07.exer3;

public class Carro {

    private char classe;
    private String tipoMotor;
    private boolean disponivel;

    public Carro(char classe, String tipoMotor) {
        validateClasse(classe);
        validateTipoMotor(tipoMotor);
        this.classe = classe;
        this.tipoMotor = tipoMotor;
        this.disponivel = true;
    }

    private void validateClasse(char classe) {
        if (classe != 'A' &&
            classe != 'B' &&
            classe != 'C' &&
            classe != 'D' &&
            classe != 'E' &&
            classe != 'F') {
            throw new IllegalArgumentException("Classe inválida");
        }
    }

    private void validateTipoMotor(String tipoMotor) {
        if (!tipoMotor.toLowerCase().equals("gasolina") &&
            !tipoMotor.toLowerCase().equals("hibrido") &&
            !tipoMotor.toLowerCase().equals("diesel") &&
            !tipoMotor.toLowerCase().equals("eletrico")) {
            throw new IllegalArgumentException("Tipo de motor inválido");
        }
    }

    public char getClasse() {
        return this.classe;
    }

    public void setClasse(char classe) {
        this.classe = classe;
    }

    public String getTipoMotor() {
        return this.tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public boolean getDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void levantar() throws Exception {
        if (this.disponivel) this.disponivel = false;
        else throw new Exception("Carro não disponível");
    }

    public void entregar() throws Exception {
        if (!this.disponivel) this.disponivel = true;
        else throw new Exception("Carro não emprestado");
    }
    
}
