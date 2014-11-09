import java.io.*;
import java.util.*;
 
public class Consola {
 
    public static void main(String[] args) {

	String izena;
 
        Console kontsola = System.console();
 	
	System.out.println("Introduce tu nombre o exit para salir: ");
        Scanner sc = new Scanner(System.in);
	izena = sc.nextLine();
 
        if (izena.equalsIgnoreCase("exit")) {

	System.out.println("El programa se ha acabado");
 
         
        }

	else {

	   // lee una linea de texto de la consola y lo devuelve.
 
            kontsola.format("El nombre es: %s \n", izena);
	}
    }
 
}
