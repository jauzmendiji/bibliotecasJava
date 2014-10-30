
import java.util.*;

public class RandomDate {

	public static void main(String[] args) 
	{
		
		int zen;

		System.out.print("\nTe dira el numero de la loteria de hoy ");
		System.out.print("\n ");
		
	
		Random rndm = new Random ();
		
		zen=rndm.nextInt(99999);
		Date eguna = new Date();	
		
		System.out.print("\nHoy dia " + eguna + " ha salido el numero " + zen + "\n" );
		
				
	}
}
