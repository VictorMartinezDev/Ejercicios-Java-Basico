import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PracticaFileio {

    public static void main(String[] args) {
        //Instanciamos el scanner para hacer uso de el
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Ingrese la ruta del archivo que desea imprimir en consola, de los contrario escriba 'salir' para abandonar");
                String rutaArchivo = scanner.nextLine();
                if (rutaArchivo.equals("salir")) {
                    break;
                }else{
                    Path pathArchivo = Paths.get(rutaArchivo);
                    try {
                        String contenido = Files.readString(pathArchivo);
                        System.out.println(contenido);
                    } catch (Exception e) {
                        System.err.println("Error al leer el archivo" + e.getMessage());
                    }
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.err.println("Error al ubicar el archivo" + e.getMessage());
        }
    }
}