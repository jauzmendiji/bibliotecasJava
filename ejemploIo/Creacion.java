import java.util.*;
import java.io.*;

public class Creacion {
    public static void main(String arglist[]) throws IOException{
    String nombre;
    String ruta;

	Scanner sc = new Scanner(System.in);
	System.out.print("\nIntroduce la ruta: ");
	ruta = sc.next();
	System.out.print("\nIntroduce un nombre para el archivo: ");
	nombre = sc.next();

    		try {

	File archivo = new File (ruta, nombre);

  	if (archivo.createNewFile())
   	System.out.println("El fichero se ha creado correctamente");
 	else
  	System.out.println("No ha podido ser creado el fichero");

	} catch (IOException ioe) {
 	ioe.printStackTrace();}
	}
}
