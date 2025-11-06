public class Tarea{

    private String nombre;
    private String descripcion;
    private int prioridad;
    private String estado;

    public Tarea(String nombre, String descripcion, int prioridad){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = "Pendiente";
    }

    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getEstado() {
        return estado;
    }
    public int getPrioridad() {
        return prioridad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarea: " + nombre +
                "\nDescripción: " + descripcion +
                "\nprioridad: " + prioridad +
                "\nestado: " + estado;
    }
}