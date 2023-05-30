
import java.util.ArrayList;

public class Modifica  {
    public ArrayList<RecogidaDatos> pedidos = new ArrayList<RecogidaDatos>();;


    	private void Añadir(int id, String producto, String color, String talla) {
   		 RecogidaDatos datos =new RecogidaDatos(id,producto,color,talla);
   		 pedidos.add(datos);   		 
   	 }
   	public Object Mostrar(int indice) {
   		return pedidos.get(indice);
   	}
       
    	public static void main(String[] args) {
        	Modifica container = new Modifica();
        	RecogidaDatos menus =new RecogidaDatos(0,"","","");
        	container.Añadir(0,menus.menuProducto(),menus.menuColor(),menus.menuTalla() );
        	container.Añadir(1,menus.menuProducto(),menus.menuColor(),menus.menuTalla() );
        	container.Mostrar(1);
       	  
    	}

}


