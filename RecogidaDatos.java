import java.util.Scanner;


public class RecogidaDatos {
    public boolean cent;
    public String producto;
    public String color;
    public String talla;
    public int id;


    public RecogidaDatos(int id, String producto, String color, String talla) {
   	 this.producto=producto;
   	 this.color=color;
   	 this.talla=talla;
    }




    public void errorMenu(int opcion, int opciones) {
   	 if (opciones >= opcion && 0 < opcion) {
   		 cent = true;
   	 } else {
   		 System.out.println("\nIntroduce una opción posible");
   	 }
    }


    public int menuPrincipal() {
   	 Scanner scanner = new Scanner(System.in);
   	 cent = false;
   	 int opciones = 2;
   	 int opcion = 0;
   	 while (cent == false) {
   		 System.out.println("\n¿Qué eres?:");
   		 System.out.println("1.Pedir");
   		 System.out.println("2.Administrar pedidos");
   		 System.out.print("Ingresa la opción: ");
   		 opcion = scanner.nextInt();
   		 errorMenu(opcion, opciones);
   	 }
   	 return opcion;
    }


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
   		 producto = "camiseta";
   	 } else if (opcion == 2) {
   		 producto = "pantalón";
   	 } else {
   		 producto = "zapatillas";
   	 }
   	 return producto;
    }


    public String menuColor() {
   	 Scanner scanner = new Scanner(System.in);
   	 cent = false;
   	 int opciones = 3;
   	 int opcion = 0;
   	 while (cent == false) {
   		 System.out.println("\n¿De que color lo quieres?:");
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


    public String menuTalla() {
   	 Scanner scanner = new Scanner(System.in);
   	 cent = false;
   	 int opciones = 3;
   	 int opcion = 0;
   	 while (cent == false) {
   		 System.out.println("\n¿De que talla lo quieres?:");
   		 System.out.println("1.Pequeña");
   		 System.out.println("2.Mediana");
   		 System.out.println("3.Grande");
   		 System.out.print("Ingresa la opción: ");
   		 opcion = scanner.nextInt();
   		 errorMenu(opcion, opciones);
   	 }


   	 if (opcion == 1) {
   		 talla = "pequeña";
   	 } else if (opcion == 2) {
   		 talla = "mediana";
   	 } else {
   		 talla = "grande";
   	 }
   	 return talla;
    }

}

