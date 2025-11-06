import java.util.HashMap;
import java.util.Scanner;

public class TareaTest {
    
    public static void main(String[] args) {
        try {
            //Iniciamos los objtos de scanner y el hashmap
            Scanner scanner = new Scanner(System.in);
            HashMap<String, Tarea> listaTareas = new HashMap<>();
            //Bucle infinito para mostrar menú
            while (true) {
                System.out.println("Elige la acción que deseas realizar"+
                                        "\n1 agregar una nueva tarea"+
                                        "\n2 mostrar lista de tareas"+
                                        "\n3 acualizar tarea"+
                                        "\n4 eliminar tarea"+
                                        "\npresione cualquier tecla para salir");
                String entradaMenu = scanner.nextLine();
                //Opcion 1: agregar una tarea
                if (entradaMenu.equals("1")) {
                    System.out.println("Ingrese el nombre de la tarea:");
                    String nombreTarea = scanner.nextLine();
                    System.out.println("Ingrese una descripción de la tarea:");
                    String entradaDescripcion = scanner.nextLine();
                    System.out.println("Ingresa la prioridad de la tarea\n1 alta\n2 media\n3 baja");
                    int entradaPrioridad = Integer.parseInt(scanner.nextLine());

                    Tarea tareaAgregar = new Tarea(nombreTarea, entradaDescripcion, entradaPrioridad);
                    listaTareas.put(nombreTarea, tareaAgregar);
                    System.out.println("Tarea agregada exitosamente");
                }
                //Opción 2: mostrar lista de tareas
                else if (entradaMenu.equals("2")) {
                    for (String key : listaTareas.keySet()) {
                        System.out.println(listaTareas.get(key));
                    }
                }
                //opcion 3: actualizar tarea
                else if (entradaMenu.equals("3")) {
                    System.out.println("ingrese la opción que desea actualizar"+
                                            "\n1 actualziar la prioridad"+
                                            "\n2 actualizar el estado de la tarea");
                    String opcionActualizar = scanner.nextLine();
                    if (opcionActualizar.equals("1")) {
                        System.out.println("Ingrese el nombre de la tarea a la que quiere actualizar la prioridad");
                        String tareaActualizar = scanner.nextLine();
                        if (!listaTareas.containsKey(tareaActualizar)) {
                            System.out.println("Nombre de tarea no encontrado, intente de nuevo");
                            continue;
                        }else{
                            System.out.println("La prioridad actual de la tarea es " + listaTareas.get(tareaActualizar).getPrioridad());
                            System.out.println("Ingresa la prioridad a la que desea actualizar\n1 alta\n2 media\n3 baja");
                            int prioridadActualizar = Integer.parseInt(scanner.nextLine());
                            listaTareas.get(tareaActualizar).setPrioridad(prioridadActualizar);
                            System.out.println("Prioridad actualizada");
                        }
                    }else if (opcionActualizar.equals("2")) {
                        System.out.println("Ingrese el nombre de la tarea a la que quiere actualizar el estado");
                        String tareaActualizar = scanner.nextLine();
                        if (!listaTareas.containsKey(tareaActualizar)) {
                            System.out.println("Nombre de tarea no encontrado, intente de nuevo");
                            continue;
                        }else{
                            System.out.println("El estado actual de la tarea es " + listaTareas.get(tareaActualizar).getEstado());
                            System.out.println("Ingresa el estado al que desea actualizar");
                            String estadoActualizar = scanner.nextLine();
                            listaTareas.get(tareaActualizar).setEstado(estadoActualizar);
                            System.out.println("Estado actualizado");
                        }
                    }
                }
                //opcion 4: eliminar tarea
                else if (entradaMenu.equals("4")) {
                    System.out.println("Ingrese el nombre de la tarea que desea eliminar");
                        String tareaEliminar = scanner.nextLine();
                        if (!listaTareas.containsKey(tareaEliminar)) {
                            System.out.println("Nombre de tarea no encontrado, intente de nuevo");
                            continue;
                        }else{
                            listaTareas.remove(tareaEliminar);
                            System.out.println("Tarea eliminada:)");
                        }
                }else{
                    break;
                }
            }
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Caracter invalido");
        }
        

    }
}