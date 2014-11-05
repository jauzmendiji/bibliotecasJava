import java.util.*;

public class HSet
{

    public static void main(String args[])
    {

	// Definir 3 instancias de la Clase Persona
        Persona a = new Persona("Jon", "Auzmendi", 21);
        Persona b = new Persona("Telmo", "Arzelus", 21);
      	Persona c = new Persona("Odei", "Alba", 20);

	// Definir un HashSet
        HashSet datos = new HashSet();
        datos.add(a);
        datos.add(b);
        datos.add(c);

	// Imprimir contenido de HashSet

        System.out.println(" - Lista de personas " + datos.size() + " elementos");

	// Definir Iterator para extraer/imprimir valores 

        for( Iterator it = datos.iterator(); it.hasNext();) { 
	    Persona x = (Persona)it.next();
	    System.out.println(x.nombre + " " + x.apellido + " " + x.edad);

	}

	// Eliminar todos los valores del ArrayList
	datos.clear();
        System.out.println(" - Lista de pedido final con " + datos.size() + " elementos");
    }
}
