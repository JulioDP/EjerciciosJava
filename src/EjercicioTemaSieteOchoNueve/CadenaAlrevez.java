package EjercicioTemaSieteOchoNueve;

public class CadenaAlrevez {
    public static void main(String[] args) {
         String textInvertida = CadenaAlrevez.Reverse("Hola mundo");
         System.out.println("Cadena invertida: " + textInvertida);
    }
    public static String Reverse(String texto){
       String textReverse = "";
        for (int i = texto.length()-1; i >= 0; i--){
            textReverse += texto.charAt(i);
        }
        return textReverse;
    }

}
