import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;
import java.util.Scanner;

/**
 * Created by soul on 5/10/16.
 */
public class EJ1 {
    public static void main(String[] args) {
        //Realiza un programa que dado un fichero que se le solicite al usuario, muestre su nombre, si 
        //es un ejecutable, si está oculto, la ruta relativa, la ruta absoluta y el tamaño.
        String rutaFichero;

        //Creamos el objeto Scanner para poder recoger la localización del fichero.
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.println("Por favor, introduzca la localización del fichero");
        //leemos lo que el usuario ha introducido para usarlo como ruta en del fichero
        rutaFichero = entradaEscaner.nextLine ();
        File fichero = new File(rutaFichero);

        //Solicitamos su nombre
        System.out.println("Nombre del ficehro: " + fichero.getName());
        //Si es ejecutable
        System.out.println("¿Es ejecutable?: " + fichero.canExecute());
        //si está oculto
        System.out.println("¿Está oculto?: " + fichero.isHidden());
        //Ruta relativa
        System.out.println("Ruta relativa: " + fichero.getPath());
        //Ruta absoluta
        System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
        //Tamaño del archivo
        System.out.println("Tamaño del archivo: " + fichero.length());
    }
}
