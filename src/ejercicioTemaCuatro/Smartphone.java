package ejercicioTemaCuatro;

public class Smartphone extends SmartDevice{
    private String sistemaOperativo;
    private String procesador;

    public Smartphone(String sistemaOperativo, String procesador) {
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
    }

    public Smartphone(float nivelBateria, boolean realizaLlamada, boolean conexionWifi, String tipoAplicacion, String tipoSoftware, String tipoSeguridad, String sistemaOperativo, String procesador) {
        super(nivelBateria, realizaLlamada, conexionWifi, tipoAplicacion, tipoSoftware, tipoSeguridad);
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
    }

    public boolean camaraEncendida(String encender){
        boolean cam = false;
        if ("encendido".equals(encender)){
            cam = true;
        }
        return cam;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", procesador='" + procesador + '\'' +
                "} " + super.toString();
    }
}
