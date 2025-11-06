public class SolicitudDeLicencia {

    private String fechaInicio;
    private String fechaFinalizacion;
    private String estado;
    private String razon;
    private int idSolicitud;

    private static int idSeguimiento = 1;

    /**
     * Contructor para asignaar las solicitud
     * 
     * @param fechaInicio //Fecha de inicio de solicitud
     * @param fechaFinalizacion //Fecha final de solicitud
     * @param estado // Estado de solicitud
     */
    public SolicitudDeLicencia(String fechaInicio, String fechaFinalizacion, String razon){
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = "pendiente";
        this.razon =razon;
        this.idSolicitud = idSeguimiento++;
    }
    //setters clase
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setRazon(String razon) {
        this.razon = razon;
    }
    //getters clase
    public String getFechaInicio() {
        return fechaInicio;
    }
    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }
    public String getEstado() {
        return estado;
    }
    public int getIdSolicitud() {
        return idSolicitud;
    }
    public String getRazon() {
        return razon;
    }

    @Override
    public String toString() {
        return "id de solicitud: " + idSolicitud +
                "\nInicio de solictus: " + fechaInicio +
                "\nFinal de solicitud: " + fechaFinalizacion +
                "\nRazón de solicitud: " + razon +
                "\nEstado de solicitud: " + estado;
    }
}