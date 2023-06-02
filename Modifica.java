import java.util.Scanner;
import java.util.ArrayList;

public class Modifica {
    public ArrayList<RecogidaDatos> pedidos = new ArrayList<>(); // ArrayList para almacenar los pedidos
    Scanner scanner = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
    public int Id = 1; // Variable para asignar IDs progresivos a los pedidos

    public void Añadir(String producto, String color, String talla) {
        RecogidaDatos datos = new RecogidaDatos(Id++, producto, color, talla); // Crear un nuevo objeto RecogidaDatos 
        pedidos.add(datos); // Agregar el pedido al ArrayList de pedidos
    }

    public void Mostrar() {
        for (RecogidaDatos RecogidaDatos : pedidos) {
            System.out.println("\nEl pedido numero " + RecogidaDatos.getId() + " es:");
            System.out.println("Producto: " + RecogidaDatos.getProducto());
            System.out.println("Color: " + RecogidaDatos.getColor());
            System.out.println("Talla: " + RecogidaDatos.getTalla());
        }
    }

    public void Eliminar() {
        boolean centinela = false;
        while (!centinela) {
            System.out.print("Ingrese el ID del pedido que quieras eliminar: ");
            int id = scanner.nextInt();
            int indice = 0; // Variable para almacenar el índice del pedido a eliminar
            boolean pedidoEncontrado = false; // Variable para indicar si se encontró el pedido

            for (int i = 0; i < pedidos.size(); i++) {
                RecogidaDatos pedido = pedidos.get(i);
                if (id == pedido.getId()) {
                    indice = i; // Guardar el índice del pedido a eliminar
                    pedidoEncontrado = true; // Indicar que se encontró el pedido
                }
            }

            if (pedidoEncontrado) {
                pedidos.remove(indice); // Eliminar el pedido utilizando el índice
                System.out.println("Pedido eliminado correctamente.");
                centinela = true; // Salir del bucle while
            } else {
                System.out.println("Ese pedido no existe");
            }
        }
    }

    public void Actualizar() {
        // Crear una instancia de la clase RecogidaDatos para acceder a los métodos de menú
        RecogidaDatos menus = new RecogidaDatos(0, "", "", "");
        boolean centinela = false;
        while (!centinela) {
            System.out.print("Ingrese el ID del pedido que quieras actualizar: ");
            int id = scanner.nextInt();
            int indice = 0; // Variable para almacenar el índice del pedido encontrado
            boolean pedidoEncontrado = false; // Variable para controlar si se encontró el pedido

            // Buscar el pedido en la lista de pedidos
            for (int i = 0; i < pedidos.size(); i++) {
                RecogidaDatos pedido = pedidos.get(i);
                if (id == pedido.getId()) {
                    indice = i; // Guardar el índice del pedido encontrado
                    pedidoEncontrado = true; // Marcar que se encontró el pedido
                }
            }

            if (pedidoEncontrado) {
                // Obtener el pedido a actualizar
                RecogidaDatos pedidoActualizar = pedidos.get(indice);
                // Actualizar los datos del pedido utilizando los métodos de menú
                pedidoActualizar.setProducto(menus.menuProducto());
                pedidoActualizar.setColor(menus.menuColor());
                pedidoActualizar.setTalla(menus.menuTalla());
                System.out.println("Pedido actualizado correctamente.");
                centinela = true; // Salir del bucle
            } else {
                System.out.println("Ese pedido no existe");
            }
        }
    }

    public boolean ArraylistVacio() {//Metodo para comprobar si el Arraylist esta vacio
        return pedidos.isEmpty();
    }
}
