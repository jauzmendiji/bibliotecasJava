import java.util.*;
import java.io.*;
public class EjemploArraylist{
	public static void main(String[] args) {

	System.out.println("¿Que quieres hacer?: (ver/crear) ");
	Scanner sc = new Scanner(System.in);
	String eran = sc.nextLine();

		if ( eran.equals("ver")) {
		
		ArrayList lista = new ArrayList();
		lista.add("Jon");
		lista.add("Auzmendi");
		lista.add("72542431v");

		System.out.println("Mostrara los elementos de la lista ");
		for (int i=0;i<lista.size();i++){
			System.out.print(" "+lista.get(i));
		}
		System.out.println();
		
		}else{


		Scanner sartu = new Scanner(System.in);

		int zen;
		ArrayList <Integer> lista2 = new ArrayList <Integer> ();
		do{
			System.out.println("Inserta los numeros que quieras: (0 para terminar)");
			zen= sartu.nextInt();
			if (zen!=0){
				lista2.add(zen);
			}
		}while(zen!=0);
		
		if (lista2.size()==0){
			System.out.println("La lista esta vacia");
		}else{
			System.out.println("Contenido de la lista: ");
			for (int i=0; i<lista2.size();i++){
				System.out.println(lista2.get(i));
			}
		}
		System.out.println("Programa bukatua");}

	}
	
}
