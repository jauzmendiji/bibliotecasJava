import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Escritura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter sartu = null;

        try {
            sartu = new PrintWriter("/home/zubiri/Escritorio/jon.txt");
            String cadena;
            System.out.println("Escribe lo que quieras. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine();
            while (!cadena.equalsIgnoreCase("FIN")) {
                sartu.println(cadena);
                cadena = sc.next();
            }
            sartu.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            sartu.close();
        }
    }
}
