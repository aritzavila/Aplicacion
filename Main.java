import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Modifica container = new Modifica();
		RecogidaDatos menus = new RecogidaDatos("", "", "");
        boolean ejecutando = true;
        while (ejecutando) {
            int opcion=menus.menuPrincipal();
            switch (opcion) {
                case 1:
                    container.Añadir(menus.menuProducto(), menus.menuColor(), menus.menuTalla());
                    break;
                case 2:
                if (pedidos.isEmpty()) {
                    int opcion2=menus.menuAdministrar();
                    if(opcion2==1){container.Mostrar();}
                    else if(opcion2==2){container.Actualizar();}
                    else{container.Eliminar();}
                    break;
                case 3:
                    System.out.println("Compra finalizada");
                    ejecutando=false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingresa un número válido.");
                    break;
            }
        }
    }
}
