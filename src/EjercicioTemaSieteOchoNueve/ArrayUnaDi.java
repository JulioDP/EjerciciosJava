package EjercicioTemaSieteOchoNueve;

public class ArrayUnaDi {
    private static String [] empleados = new String[]  {"Juan","Lucas", "carmelo", "Cancino", "Carmela", "Miguel"};
    public static void main(String[] args) {
        ArrayUnaDi.recorreArray();
    }
    public static void recorreArray (){
        System.out.println("Lista de empleados");
        for (String nombres: empleados) {
            System.out.println(nombres);
        }
    }
}
