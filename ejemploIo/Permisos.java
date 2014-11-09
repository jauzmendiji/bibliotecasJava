import java.io.*;
import java.util.*;

public class Permisos
{
	public static void main(String[] args) 
	{
	
	String nombre;
	String ruta;

	Scanner sc = new Scanner(System.in);
	System.out.print("\nIntroduce la ruta: ");
	ruta = sc.next();
	System.out.print("\nIntroduce el nombre del archivo: ");
	nombre = sc.next();
	
	
	String archivo = ruta + nombre;

	FilePermission permiso = new FilePermission(archivo, "read, write" );
	System.out.println(permiso.getActions());
	}

}
