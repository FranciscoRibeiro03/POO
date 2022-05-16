package aula08.exer2;

import java.util.ArrayList;

public class PratoVegetariano extends Prato implements Vegetariano {

    private ArrayList<Alimento> ingredientes;

    public PratoVegetariano(String nome) {
        super(nome);
        this.ingredientes = new ArrayList<>();
    }

    @Override
    public void setIngredientes(ArrayList<Alimento> alimentos) {
        for (Alimento a : alimentos)
            if (!(a instanceof Vegetariano)) throw new IllegalArgumentException("Prato não pode conter alimentos não vegetarianos");
            
        this.ingredientes = alimentos;
    }

    public boolean addIngrediente(Alimento alimento) {
        if (!(alimento instanceof Vegetariano)) return false;
        return this.ingredientes.add(alimento);
    }
    
    @Override
    public String toString() {
        return super.toString() + " - Prato Vegetariano";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        PratoVegetariano other = (PratoVegetariano) obj;
        return this.getNome().equals(other.getNome());
    }
    
}
