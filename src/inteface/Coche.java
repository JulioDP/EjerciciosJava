package inteface;

public class Coche {
    private String color;
    private String marca;
    private String modelo;

    public Coche(){

    }

    public Coche(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
