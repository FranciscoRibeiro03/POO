package aula07.exer3;

public class QuartoHotel extends Alojamento {

    private String tipoQuarto;

    private void validateTipo(String tipoQuarto) {
        if (!tipoQuarto.toLowerCase().equals("single") &&
            !tipoQuarto.toLowerCase().equals("Double") && 
            !tipoQuarto.toLowerCase().equals("Double") && 
            !tipoQuarto.toLowerCase().equals("Triple")) {
            throw new IllegalArgumentException("Tipo de quarto inválido");
        }
    }
    
    public QuartoHotel(String code, String name, String location, double pricePerNight, boolean available, double evaluation, String tipoQuarto) {
        super(code, name, location, pricePerNight, available, evaluation);
        validateTipo(tipoQuarto);
        this.tipoQuarto = tipoQuarto;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        validateTipo(tipoQuarto);
        this.tipoQuarto = tipoQuarto;
    }
    
}
