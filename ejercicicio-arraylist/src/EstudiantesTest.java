import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class EstudiantesTest {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Estudiantes> listaEstudiantes = new ArrayList<Estudiantes>();

            while (true) {
                System.out.println("Ingresa la accción que deseas realizar"+
                                    "\n1 para agregar un estudiante"+
                                    "\n2 para ver la lista de estudiantes"+
                                    "\n3 para actualizar algún estudiante"+
                                    "\n4 para ordenar la lista por edades de menor a mayor"+
                                    "\npara salir precione cualquier tecla");

                String entradaMenu = scanner.nextLine();

                if (entradaMenu.equals("1")) {
                    System.out.println("Introduzca el nombre del estudiante");
                    String nombreEstudiante = scanner.nextLine();
                    System.out.println("Agregue la edad del estudiante");
                    int edadEstudiante = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingresa la especialidad del estudiante");
                    String especialidadEstudiante = scanner.nextLine();

                    //Creamos el objeto del nuevo estudiante
                    Estudiantes estudiante = new Estudiantes(nombreEstudiante, edadEstudiante, especialidadEstudiante);
                    listaEstudiantes.add(estudiante);
                    System.out.println("Estudiante agregado con exito");
                }
                //Opcion 2 para mostrar lista
                else if (entradaMenu.equals("2")) {
                    listaEstudiantes.forEach(estudiante -> System.out.println(estudiante));
                    
                }
                //Opción 3 para modificar datos de un alumno
                else if (entradaMenu.equals("3")) {
                    System.out.println("Ingrese el indice del estudiante que quiere actualizar");
                    int indexEstudiante = Integer.parseInt(scanner.nextLine());
                    if (indexEstudiante> listaEstudiantes.size()-1) {
                        System.out.println("El index ingresado es mayor al indice maximo de la lista");
                        continue;
                    }else{
                        System.out.println("Que valor desea actualizar"+
                                            "\n1 nombre"+
                                            "\n2 edad"+
                                            "\n3 especialidad");
                        String entradaActualizacion = scanner.nextLine();

                        //Opcion para actualizar el nombre del estudiante
                        if (entradaActualizacion.equals("1")) {
                            System.out.println("Ingrese la actualización del nombre");
                            String actualizacionNombre = scanner.nextLine();
                            listaEstudiantes.get(indexEstudiante).setNombre(actualizacionNombre);
                            System.out.println("Nombre actualzado ;)");
                        }
                        //Opción para actualizar edad
                        else if (entradaActualizacion.equals("2")) {
                            System.out.println("Ingrese la actualzación de edad");
                            int edadActualizacion = Integer.parseInt(scanner.nextLine());
                            listaEstudiantes.get(indexEstudiante).setEdad(edadActualizacion);
                            System.out.println("Edad actualizada con exito");
                        }
                        //Opción para actualizar especialización
                        else if (entradaActualizacion.equals("3")) {
                            System.out.println("Ingrese la actualización de especialización");
                            String actualizacionEspecializacion = scanner.nextLine();
                            listaEstudiantes.get(indexEstudiante).setEspecialidad(actualizacionEspecializacion);
                            System.out.println("Actualizacion con exito");
                        }
                        else{
                            System.out.println("Ingrese un valor correcto");
                        }
                    }
                }
                //Opción 4 para ordenar lista por edades de menor a mayor
                else if (entradaMenu.equals("4")) {
                    Collections.sort(listaEstudiantes, new Comparator<Estudiantes>() {
                        @Override
                        public int compare(Estudiantes estudiante1, Estudiantes estudiante2){
                            return Integer.compare(estudiante1.getEdad(), estudiante2.getEdad());
                        }
                    });
                    System.out.println("Lsita ordenada de menor a mayor por edad");
                    listaEstudiantes.forEach(estudiante -> System.out.println(estudiante));
                }else{
                    break;
                }
            }
            scanner.close();
            
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Eroor al formatear el valor de la entrada, ingrese un valor adecuado");
        }
    }
}