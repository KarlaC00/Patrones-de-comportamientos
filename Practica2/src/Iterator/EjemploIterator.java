package Iterator;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class EjemploIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Producto> productos = new ArrayList<>();
		productos.add(new Producto("1", "Tornillos"));
		productos.add(new Producto("2", "Tuercas"));
		productos.add(new Producto("3", "Llaves"));
		
		JOptionPane.showMessageDialog(null, "PRODUCTOS\n\n" + imprimirDatos(productos));
	}
	
	
	private static String imprimirDatos(ArrayList<Producto> productos) {
		String lista = "";
		
		
		Iterator<Producto> iterator = productos.iterator();
		
		
		while(iterator.hasNext()) {
			lista += iterator.next().toString();
		}
		
		
		return lista;
	}

}
