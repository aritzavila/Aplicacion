public class Main {
    public static void main(String[] args) {
        Modifica container = new Modifica();
		RecogidaDatos menus = new RecogidaDatos(0,"", "", "");
        boolean ejecutando = true;
        while (ejecutando) {
            int opcion=menus.menuPrincipal();
            switch (opcion) {
                case 1:
                    container.Añadir(menus.menuProducto(), menus.menuColor(), menus.menuTalla());
                    break;
                case 2:
                    int opcion2=menus.menuAdministrar(container.ArraylistVacio());
                    if(opcion2==1){container.Mostrar();}
                    else if(opcion2==2){container.Actualizar();}
                    else if(opcion2==3){container.Eliminar();}
                    else{System.out.println("No tienes pedidos");}
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

