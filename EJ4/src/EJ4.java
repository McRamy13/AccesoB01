import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

/**
 * Created by soul on 9/10/16.
 */
public class EJ4 {
    public static void main(String[] args) {
        //4  Un filtro sirve para que el método list devuelva solo aquellos archivos o carpetas que 
        //cumplan una condición (que tengan una extensión determinada, contengan en su nombre una 
        //cadena concreta, empiecen por un carácter, etc). Un filtro es un objeto de una clase que implementa
       //el interface FilenameFilter. Realiza un programa que muestre los archivos de un directorio que 
        //posean una extensión concreta. Tanto la extensión como el directorio se solicita al usuario. 


        //Creamos la varibale rutaFichero y extension
        String rutaFichero;
        String extension;
        //Creamos los objetos scanner para solicitar al usuario lo necesario.
        Scanner ficheroRuta = new Scanner(System.in);
        Scanner extensionFichero = new Scanner(System.in);

        //A continuación solicitamos al usuario ambos apartados.

        System.out.println("Introduzca una localización para el fichero");
        rutaFichero = ficheroRuta.nextLine();
        System.out.println("Introduzca una extensión");
        //Creamos el objeto fichero
        File f = new File(rutaFichero);
        extension = extensionFichero.nextLine();

        //Llamamos a la clase FilenameFilter
        FilenameFilter filtro = new FilenameFilter(){
            @Override
            public boolean accept(File f, String name) {
                //Si tenemos en la extensión . y algo después, retornamos true, si no false.
                if (name.toLowerCase().endsWith(extension.toLowerCase())){
                    return true;
                }else{
                   return false;
                }
            }
        };
        //Ahora buscamos en el fichero, filtrando creando el array de ficheros
        File[] ficheros = f.listFiles(filtro);
        for (int i = 0; i < ficheros.length; i++){
            //Si el fichero es un directorio, entonces lo inficamos, si no, ponemos el archivo.
            if(ficheros[i].isDirectory()){
                System.out.println(ficheros[i].getName() + " ");
            }else{
                System.out.println("    =>" + ficheros[i].getName());
            }
        }
        if(filtro.equals(false)){
            System.out.println( "No se han encontrado archivos con la extensión" + extension);
        }
    }
}
