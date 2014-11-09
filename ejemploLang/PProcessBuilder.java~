import java.util.*;
	import java.io.*;
	import java.lang.ProcessBuilder.Redirect;

	public class PProcessBuilder {
		public static void main(String[] args) throws IOException {

		String comando ="date";
		String salida;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEscribe el comando que quieras usar para salir escribe salir");
		comando = sc.next();		

		while (!comando.equals("salir") )
		{
				
		//se crea el constructor ProcessBuilder para que el comando introducido pueda ser ejecutado
		ProcessBuilder processBuilder = new ProcessBuilder(comando);

			//Archivos en los que imprimira
			File dirOut = new File("/home/zubiri/proyectojava/java2/bibliotecasJava/ejemploLang/resultado.txt");
			File dirErr = new File("/home/zubiri/proyectojava/java2/bibliotecasJava/ejemploLang/errores.txt");

			processBuilder.redirectOutput(dirOut);
			processBuilder.redirectError(dirErr);	

			processBuilder.start();
			
			//lectura del fichero donde esta escrito la salida, despues lo imprimira en la pantalla
			FileReader leer = new FileReader("/home/zubiri/proyectojava/java2/bibliotecasJava/ejemploLang/resultado.txt");
			
			BufferedReader bf = new BufferedReader(leer);
			while ((salida = bf.readLine())!=null) 
				{
   				System.out.println(salida);
				}

			System.out.println("\nEscribe el comando que quieras usar para salir escribe salir");
			comando = sc.next();
		}
	}
}
