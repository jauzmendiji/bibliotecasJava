import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;

public class EjemploArrays
{
	public static void main (String[] args)
	{
		// Declaramos la variable numeros como array, la cual tendrá 6 posiciones en memoria (0-5)
		int[] numeros = new int[6];

		// Damos valor a cada espacio de memoria, exceptuando la última posición
		numeros[0] = -2;
		numeros[1] = 5;
		numeros[2] = 1;
		numeros[3] = 9;
		numeros[4] = -6;

		// Creamos el objeto "sc" de tipo Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Introduce un número para añadir al array: ");
		// Guardamos en la posición 6 (5) el número introducido por teclado
		numeros[5] = sc.nextInt();

		System.out.println("\n Numeros sin ordenar según posición");

		for (int i = 0; i < numeros.length; i++)
		{ 
			System.out.print(numeros[i] + "     "); 
		} 


		// Ordena la matriz especificada de enteros en orden numérico ascendente.
		Arrays.sort(numeros);
		//Arrays.sort(numeros, Collections.reverseOrder());

		System.out.println("\n Numeros ordenados");

		// numeros.length --> Longitud del array (12)
		for (int i = 0; i < numeros.length; i++)
		{ 
			System.out.print(numeros[i] + "     "); 
		}

		System.out.println("");

	} 


}
