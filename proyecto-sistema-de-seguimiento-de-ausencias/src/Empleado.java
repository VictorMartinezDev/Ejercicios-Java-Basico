public class Empleado {
    
    private int idEmpleado;
    private String nombre;
    private String departamento;
    private String email;
    private int saldoVaciones = 20;
    //Variable para asignar id de manera autimatica
    private static int idAsignacion = 1;
    //constructores
    public Empleado(String nombre, String departamento, String email){
        this.idEmpleado =idAsignacion++;
        this.nombre = nombre;
        this.departamento = departamento;
        this.email = email;
    }
    public Empleado(String nombre){
        this(nombre, "Sin asignar", "Sin asignar");
    }
    //setters de clase
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSaldoVaciones(int saldoVaciones) {
        if (saldoVaciones<=0) {
            System.out.println("No puedes agregar saldos negativos");
        }else{
        this.saldoVaciones = saldoVaciones;
        }
    }
    // getters de clase
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDepartamento() {
        return departamento;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Nombre de empleado: " + nombre +
                "\nId de empleado: " +idEmpleado +
                "\nDepartamento: " + departamento +
                "\nemail: " + email;
    }

    //Metodos de clase
    /**
     * Método para modificar los días de vaciones despues de una solicitud
     * @param diasDeLicencia
     * @return // retornamos true si se pueden asignar los dias de lo contrario retornamos false debido
     * a que la cantidad solicitada es mayor a la restante
     */
    public boolean saldoRestante(int diasDeLicencia){
        if (saldoVaciones-diasDeLicencia<0) {
            System.out.println("Los días solicitados son más de los días restantes de saldo"+
            "\nte quedan solo " + saldoVaciones + " días de vacaciones");
            return false;
        }else{
            saldoVaciones -= diasDeLicencia;
            return true;
        }
    }
}
