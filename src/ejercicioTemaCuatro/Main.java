package ejercicioTemaCuatro;

public class Main {
    private static SmartDevice dispositivoPhone;
    private static SmartDevice dispositivoSmart;

    public static void main(String[] args) {
        dispositivoPhone = new Smartphone(12.3f,true,true,
                "Java","Google","alta","Android","Potente");

        dispositivoSmart = new smartWatch("Moderno");

        System.out.println(dispositivoPhone);
        System.out.println(dispositivoSmart);
    }
}
