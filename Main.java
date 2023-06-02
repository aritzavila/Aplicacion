public class Main {
    public static void main(String[] args) {
        Modifica array = new Modifica();  // Instancia de la clase Modifica para gestionar los pedidos
		RecogidaDatos menus = new RecogidaDatos(0,"", "", "");  // Instancia de la clase RecogidaDatos para gestionar los menús de opciones
        boolean ejecutando = true;
        while (ejecutando) {
            int opcion=menus.menuPrincipal();  // Mostrar el menú principal y obtener la opción seleccionada
            switch (opcion) {
                case 1:
                	array.Añadir(menus.menuProducto(), menus.menuColor(), menus.menuTalla());  // Agregar un nuevo pedido 
                    break;
                case 2:
                    int opcion2=menus.menuAdministrar(array.ArraylistVacio());  // Mostrar menú de administración de pedidos y obtener la opción seleccionada
                    if(opcion2==1){
                    	array.Mostrar();  // Mostrar los pedidos existentes 
                    } else if(opcion2==2){
                    	array.Actualizar();  // Actualizar un pedido existente 
                    } else if(opcion2==3){
                    	array.Eliminar();  // Eliminar un pedido existente 
                    } else{
                        System.out.println("No tienes pedidos");  // Mensaje de error si no hay pedidos en el contenedor
                    }
                    break;
                case 3:
                    System.out.println("Compra finalizada");  // Mensaje de finalización de la compra
                    ejecutando=false;  // Salir del bucle while y finalizar el programa
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingresa un número válido.");  // Mensaje de error si se ingresa una opción inválida
                    break;
            }
        }
    }
}

