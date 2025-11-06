public class SolicitudDeLicenciasTest {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Victor", "Desarrollo", "victor.martines@gmail");
        Empleado empleado2 = new Empleado("Karina");
        Empleado empleado3 = new Empleado("Sophia", "Biomédica", "sophia.lopez@micorreo.com");

        SolicitudDeLicencia solicitudDeLicencia1 = new SolicitudDeLicencia("11-03-2025", "18-03-2025", "vacaciones");

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(solicitudDeLicencia1);
        System.out.println(empleado3);

    }
}