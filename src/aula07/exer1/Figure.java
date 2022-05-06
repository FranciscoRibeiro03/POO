package aula07.exer1;

public abstract class Figure {

    private String colour;

    public abstract double getArea();
    public abstract double getPerimeter();

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public String getColour() {
        return this.colour;
    }

}