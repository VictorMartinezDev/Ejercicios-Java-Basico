
public class Estudiantes{

    private String nombre;
    private int edad;
    private String especialidad;

    public Estudiantes(String nombre, int edad, String especialidad){
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
    }

    public Estudiantes(String nombre){
        this(nombre, 18, "sin especificar");
    }
    public Estudiantes(String nombre, int edad){
        this(nombre, edad, "Sin especificar");
    }

    public int getEdad() {
        return edad;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nombre + " con edad de " + edad + " y especialidad " + especialidad;
    }
}