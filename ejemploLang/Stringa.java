
import java.lang.String;
import java.util.Scanner;

public class Stringa
{
	public static void main (String[] args)
	{
	//declaracion de las variables de tipo string
		String str1;
		String str2;

	
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Intruoduce el el primer string en mayuscula: ");
		str1 = sc.nextLine();

	
		System.out.print("\n Introduce el segundo string en minuscula: ");
		str2 = sc.nextLine();



		// con el siguiente objeto concatena los dos strings
    		String konka = str1.concat(str2);
   		System.out.println("\n Strings concatenados: " + konka);
		

		//para convertir en mayusculas o minusculas los caracteres del string
		String minus = str1.toLowerCase();
		String mayus = str2.toUpperCase();

		System.out.print("String1 cambiado: " + minus);
		System.out.print("\nString2 cambiado: " + mayus);


		//para comparar los dos Strings si son iguales da igual mayuscula o minuscula
		if (str1.equalsIgnoreCase(str2) ) // equals comparar, IgnoreCase pasa del minus/mayus
			System.out.println("\nLos dos strings son iguales");
		else
			System.out.println("\nlos dos strings son diferentes");

		//isEmpty para saber si esta vacio
		if (str1.isEmpty())
			System.out.println("el String1 esta vacio");

		if (str2.isEmpty())
			System.out.println("el String2 esta vacio");

		//para convertir datos de cualquier tipo a string
		System.out.print("\n Introduce un numero para convertirlo a string ");
		int num = sc.nextInt();
		//valueOf para convertirlo
		String intstring = String.valueOf(num);
		System.out.print(num);
				
	}
}
