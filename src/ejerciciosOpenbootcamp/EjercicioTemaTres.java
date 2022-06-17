package ejerciciosOpenbootcamp;

public class EjercicioTemaTres {

    private static String [] lista = {"Juan", "Camilo", "Angel", "Pablo", "Tomas", "Timoteo", "Julio", "Jeremias"};
    public static void main(String[] args) {
        System.out.println(Concatenar());
    }
    private static String Concatenar(){
        String unir = "";
        for (String nombres: lista) {
            unir += nombres +"\n";
        }
        return unir;
    }
}
