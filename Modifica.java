import java.util.Scanner;
import java.util.ArrayList;

public class Modifica {
	public ArrayList<RecogidaDatos> pedidos = new ArrayList<>();;
	Scanner scanner = new Scanner(System.in);
	public int Id = 1;

	public void Añadir(String producto, String color, String talla) {
		RecogidaDatos datos = new RecogidaDatos(Id++, producto, color, talla);
		pedidos.add(datos);
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
	        int index = -1; // Variable para almacenar el índice del pedido a eliminar
	        boolean pedidoEncontrado = false; // Variable para indicar si se encontró el pedido

	        for (int i = 0; i < pedidos.size(); i++) {
	            RecogidaDatos pedido = pedidos.get(i);
	            if (id == pedido.getId()) {
	                index = i; // Guardar el índice del pedido a eliminar
	                pedidoEncontrado = true;
	            }
	        }

	        if (pedidoEncontrado) {
	            pedidos.remove(index);
	            System.out.println("Pedido eliminado correctamente.");
	            centinela = true;
	        } else {
	            System.out.println("Ese pedido no existe");
	        }
	    }
	}

	public void Actualizar() {
		RecogidaDatos menus = new RecogidaDatos(0, "", "", "");
		boolean centinela = false;
		while (centinela == false) {
			System.out.print("Ingrese indice del producto que quieras actualizar: ");
			int indiceActualizar = scanner.nextInt();
			scanner.nextLine();
			if (indiceActualizar >= 0 && indiceActualizar < pedidos.size()) {
				RecogidaDatos personaActualizar = pedidos.get(indiceActualizar);
				personaActualizar.setProducto(menus.menuProducto());
				personaActualizar.setColor(menus.menuColor());
				personaActualizar.setTalla(menus.menuTalla());
				System.out.println("Persona actualizada correctamente.");
				System.out.println("-----------------------");
				centinela = true;
			} else {
				System.out.println("No existe ese pedido");
			}
		}
	}

	public boolean ArraylistVacio() {
		return pedidos.isEmpty();
	}
}
