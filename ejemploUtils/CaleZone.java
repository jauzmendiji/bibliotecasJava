import java.text.SimpleDateFormat;
import java.util.*;
	 
	public class CaleZone {
	 
	     public static void main(String[] args) {

	        // Nos da informacion sobre nuestro calendario
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        Calendar calendar = Calendar.getInstance();

		System.out.println("Date de dos maneras");

	        System.out.println(dateFormat.format(calendar.getTime()));

	        System.out.println(calendar.get(Calendar.YEAR) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.DATE) + "   " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE));

		TimeZone tz = TimeZone.getDefault();

		tz.getDefault ();

		System.out.println("\nTu zona horaria es " + tz.getDisplayName());
		System.out.println("Zona horaria " + tz.getID());
	     }
	}
