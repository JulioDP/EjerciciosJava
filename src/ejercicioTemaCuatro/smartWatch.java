package ejercicioTemaCuatro;

public class smartWatch extends SmartDevice {
    private String tipoSmartWatch;


    public smartWatch(String tipoSmartWatch) {
        this.tipoSmartWatch = tipoSmartWatch;
    }

    public smartWatch(float nivelBateria, boolean realizaLlamada, boolean conexionWifi, String tipoAplicacion, String tipoSoftware, String tipoSeguridad, String tipoSmartWatch) {
        super(nivelBateria, realizaLlamada, conexionWifi, tipoAplicacion, tipoSoftware, tipoSeguridad);
        this.tipoSmartWatch = tipoSmartWatch;
    }

    public void reiniciarHora(boolean reiniciarH){
        if (reiniciarH){
            System.out.println("Hora reiniciada");
        }
    }

    @Override
    public String toString() {
        return "smartWatch{" +
                "tipoSmartWatch='" + tipoSmartWatch + '\'' +
                "} " + super.toString();
    }


}
