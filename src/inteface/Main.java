package inteface;

public class Main {

    public static void main(String[] args) {

        CocheCRUD coch = new CocheCRUDImpl();
        coch.save(new Coche("Negro", "Toyota", "2022"));
        coch.save(new Coche("Gris", "Humer", "2022"));
        coch.save(new Coche("Gris", "Humer", "1999"));
        System.out.println("Lista coches:" + coch.finAll());
        coch.delete("1999");
        System.out.println("Lista coches:" + coch.finAll());

    }
}
