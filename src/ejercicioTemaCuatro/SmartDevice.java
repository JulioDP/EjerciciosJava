package ejercicioTemaCuatro;

public class SmartDevice {

    private float nivelBateria;
    private boolean RealizaLlamada;
    private boolean conexionWifi;
    private String tipoAplicacion;
    private String tipoSoftware;
    private String tipoSeguridad;

    public SmartDevice(){

    }

    public SmartDevice(float nivelBateria, boolean realizaLlamada, boolean conexionWifi, String tipoAplicacion, String tipoSoftware, String tipoSeguridad) {
        this.nivelBateria = nivelBateria;
        RealizaLlamada = realizaLlamada;
        this.conexionWifi = conexionWifi;
        this.tipoAplicacion = tipoAplicacion;
        this.tipoSoftware = tipoSoftware;
        this.tipoSeguridad = tipoSeguridad;
    }

    protected boolean isTotalCarga(int carga){
        boolean total = false;
        if (carga == 100){
            total = true;
        }
        return total;
    }

    public boolean VerificacionContraseña(String contraseña){
        boolean very = false;
        String cuenta = "12345";
        if (cuenta.equals(contraseña)){
            very = true;
        }
        return very;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "nivelBateria=" + nivelBateria +
                ", RealizaLlamada=" + RealizaLlamada +
                ", conexionWifi=" + conexionWifi +
                ", tipoAplicacion='" + tipoAplicacion + '\'' +
                ", tipoSoftware='" + tipoSoftware + '\'' +
                ", tipoSeguridad='" + tipoSeguridad + '\'' +
                '}';
    }
}
