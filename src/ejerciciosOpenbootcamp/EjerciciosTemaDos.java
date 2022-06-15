package ejerciciosOpenbootcamp;

public class EjerciciosTemaDos {
    public static void main(String[] args) {
        System.out.println("El precio total es de: "+ calcularPrecio(100));
        System.out.println("Iva incluido de 8%");
    }
    private static double calcularPrecio(double precio){
        double precioTotal = (0.08 * precio) + precio;
        return precioTotal;
    }
}
