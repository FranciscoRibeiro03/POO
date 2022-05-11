package aula08.exer1;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Empresa {

    private String nome;
    private String codigoPostal;
    private String email;
    
    private ArrayList<Veiculo> veiculos;

    public Empresa(String nome, String codigoPostal, String email) {
        validarEmail(email);
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        this.email = email;
        this.veiculos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        validarEmail(email);
        this.email = email;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void addVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public void addVeiculos(Veiculo... veiculos) {
        for (Veiculo veiculo : veiculos) {
            this.addVeiculo(veiculo);
        }
    }

    private void validarEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser vazio");
        }
        Pattern regex = Pattern.compile("^[\\w-+\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        if (!regex.matcher(email).matches()) {
            throw new IllegalArgumentException("Email inválido");
        }
    }

    @Override
    public String toString() {
        return "Empresa{" + "nome=" + nome + ", codigoPostal=" + codigoPostal + ", email=" + email + ", veiculos=" + veiculos + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final Empresa other = (Empresa) obj;
        return this.getNome().equals(other.getNome()) &&
            this.getCodigoPostal().equals(other.getCodigoPostal()) &&
            this.getEmail().equals(other.getEmail()) &&
            this.getVeiculos().equals(other.getVeiculos());
    }
    
}
