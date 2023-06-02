import java.util.Scanner;

public class RecogidaDatos {
	public boolean cent; // Variable para controlar la validez de las opciones ingresadas
	public String producto; // Variable para almacenar el producto
	public String color; // Variable para almacenar el color
	public String talla; // Variable para almacenar la talla
	public int id; // Variable para almacenar el ID del pedido
	
	public RecogidaDatos(int id, String producto, String color, String talla) {
		this.id = id;
		this.producto = producto; 
		this.color = color; 
		this.talla = talla; 
	}
//Getters y Setters
	public int getId() {
		return id; 
	}

	public void setId(int id) {
		this.id = id; 
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto; 
	}

	public String getColor() {
		return color; 
	}

	public void setColor(String color) {
		this.color = color; 
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla; 
	}

	// Método para controlar la validez de las opciones ingresadas en el menú
	public void errorMenu(int opcion, int opciones) {
		if (opciones >= opcion && 0 < opcion) {
			cent = true; // La opción es válida
		} else {
			System.out.println("\nIntroduce una opción posible"); // Mensaje de error para una opción inválida
		}
	}

	// Método para mostrar el menú principal y obtener la opción seleccionada
	public int menuPrincipal() {
		Scanner scanner = new Scanner(System.in);
		cent = false; // Reinicia el valor de la variable de control
		int opciones = 3; // Número de opciones en el menú principal
		int opcion = 0; // Variable para almacenar la opción seleccionada
		while (cent == false) {
			System.out.println("\n¿Qué quieres hacer?:");
			System.out.println("1.Pedir");
			System.out.println("2.Administrar pedidos");
			System.out.println("3.Finalizar compra");
			System.out.print("Ingresa la opción: ");
			opcion = scanner.nextInt();
			errorMenu(opcion, opciones); // Verifica si la opción es válida
		}
		return opcion; // Devuelve la opción seleccionada
	}

	// Método para mostrar el menú de administración y obtener la opción seleccionada
	public int menuAdministrar(boolean vacio) {
		Scanner scanner = new Scanner(System.in);
		cent = false; 
		int opciones = 3; 
		int opcion = 0; 
		if (vacio == false) {
			while (cent == false) {
				System.out.println("\n¿Qué quieres hacer?:");
				System.out.println("1.Mostrar");
				System.out.println("2.Modificar un pedido");
				System.out.println("3.Eliminar pedido");
				System.out.print("Ingresa la opción: ");
				opcion = scanner.nextInt();
				errorMenu(opcion, opciones); 
			}
		}
		return opcion; 
	}

	// Método para mostrar el menú de selección de producto y obtener el producto seleccionado
	public String menuProducto() {
		Scanner scanner = new Scanner(System.in);
		cent = false; 
		int opciones = 3; 
		int opcion = 0; 
		while (cent == false) {
			System.out.println("\n¿Qué quieres pedir?:");
			System.out.println("1.Camiseta");
			System.out.println("2.Pantalón");
			System.out.println("3.Zapatillas");
			System.out.print("Ingresa la opción: ");
			opcion = scanner.nextInt();
			errorMenu(opcion, opciones);
		}

		if (opcion == 1) {
			producto = "camiseta"; // Asigna "camiseta" como producto
		} else if (opcion == 2) {
			producto = "pantalón"; // Asigna "pantalón" como producto
		} else {
			producto = "zapatillas"; // Asigna "zapatillas" como producto
		}
		return producto; 
	}

	// Método para mostrar el menú de selección de color y obtener el color seleccionado
	public String menuColor() {
		Scanner scanner = new Scanner(System.in);
		cent = false; 
		int opciones = 3;
		int opcion = 0; 
		while (cent == false) {
			System.out.println("\n¿De qué color lo quieres?:");
			System.out.println("1.Azul");
			System.out.println("2.Negro");
			System.out.println("3.Blanco");
			System.out.print("Ingresa la opción: ");
			opcion = scanner.nextInt();
			errorMenu(opcion, opciones);
		}

		if (opcion == 1) {
			color = "azul"; 
		} else if (opcion == 2) {
			color = "negro"; 
		} else {
			color = "blanco";
		}
		return color; 
	}

	// Método para mostrar el menú de selección de talla y obtener la talla seleccionada
	public String menuTalla() {
		Scanner scanner = new Scanner(System.in);
		cent = false; 
		int opciones = 3; 
		int opcion = 0; 
		while (cent == false) {
			System.out.println("\n¿De qué talla lo quieres?:");
			System.out.println("1.S");
			System.out.println("2.M");
			System.out.println("3.L");
			System.out.print("Ingresa la opción: ");
			opcion = scanner.nextInt();
			errorMenu(opcion, opciones); 
		}

		if (opcion == 1) {
			talla = "S"; 
		} else if (opcion == 2) {
			talla = "M"; 
		} else {
			talla = "L"; 
		}
		return talla; 
	}
}

