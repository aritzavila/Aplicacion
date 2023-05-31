import java.util.Scanner;
import java.util.ArrayList;

public class Modifica {
	public ArrayList<RecogidaDatos> pedidos = new ArrayList<>();;
	Scanner scanner = new Scanner(System.in);


	private void Añadir(String producto, String color, String talla) {
		RecogidaDatos datos = new RecogidaDatos(producto, color, talla);
		pedidos.add(datos);
	}

	public void Mostrar() {
		int id = 1;
		for (RecogidaDatos RecogidaDatos : pedidos) {
			System.out.println("\nEl pedido numero " +id+ " es:");
			System.out.println("Producto: " + RecogidaDatos.getProducto());
			System.out.println("Color: " + RecogidaDatos.getColor());
			System.out.println("Talla: " + RecogidaDatos.getTalla());
			id++;
		}
	}

	public void Eliminar(int indice){
		boolean centinela=false;
		while (centinela ==false) {
		if (indice >= 0 && indice < pedidos.size()) {
            pedidos.remove(indice);
            System.out.println("Pedido eliminado correctamente.");
			centinela=true;
        } else {
            System.out.println("Ese pedido no existe");
        } }
	}

	public void Actualizar(){
		RecogidaDatos menus = new RecogidaDatos("", "", "");
		boolean centinela=false;
		while (centinela ==false) {
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
						centinela=true;
                    } else {
                        System.out.println("No existe ese pedido");
                    }}
	}

	public static void main(String[] args) {
		Modifica container = new Modifica();
		RecogidaDatos menus = new RecogidaDatos("", "", "");
		container.Añadir(menus.menuProducto(), menus.menuColor(), menus.menuTalla());
		container.Mostrar();
		container.Actualizar();
		container.Mostrar();
	}

}
