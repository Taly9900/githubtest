package negocio;
import datos.Impresion;
import java.util.Scanner;

public class Lectura{
	Impresion obj = new Impresion();
	Scanner leer = new Scanner(System.in);
	public void mensaje(){
	   System.out.println("Necesito que escribas algo aquí: ");

	   System.out.println("Hola de nuevo");
	   String mandar = leer.nextLine();
	   obj.resultado(mandar);
	}
}