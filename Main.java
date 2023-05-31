import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Modifica container = new Modifica();
		RecogidaDatos menus = new RecogidaDatos("", "", "");
        boolean ejecutando = true;
        while (ejecutando) {
            int opcion=menus.menuPrincipal();
            switch (opcion) {
                case 1:
                    container.
                    break;
                case 2:
                    System.out.println("Lista de personas:");
                    for (Persona persona : listaPersonas) {
                        System.out.println("Nombre: " + persona.getNombre());
                        System.out.println("Edad: " + persona.getEdad());
                        System.out.println("-----------------------");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el índice de la persona a actualizar: ");
                    int indiceActualizar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer de entrada

                    if (indiceActualizar >= 0 && indiceActualizar < listaPersonas.size()) {
                        System.out.print("Ingrese el nuevo nombre: ");
                        String nuevoNombre = scanner.nextLine();
                        System.out.print("Ingrese la nueva edad: ");
                        int nuevaEdad = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer de entrada

                        Persona personaActualizar = listaPersonas.get(indiceActualizar);
                        personaActualizar.setNombre(nuevoNombre);
                        personaActualizar.setEdad(nuevaEdad);
                        System.out.println("Persona actualizada correctamente.");
                        System.out.println("-----------------------");
                    } else {
                        System.out.println("El índice especificado está fuera de rango.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el índice de la persona a eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer de entrada

                    if (indiceEliminar >= 0 && indiceEliminar < listaPersonas.size()) {
                        listaPersonas.remove(indiceEliminar);
                        System.out.println("Persona eliminada correctamente.");
                        System.out.println("-----------------------");
                    } else {
                        System.out.println("El índice especificado está fuera de rango.");
                    }
                    break;
                case 5:
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingresa un número válido.");
                    break;
            }
        }
    }
}
