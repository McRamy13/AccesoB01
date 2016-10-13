import java.io.File;
import java.util.Scanner;

/**
 * Created by soul on 9/10/16.
 */
public class EJ3 {
    /**
     * Created by soul on 8/10/16.
     */
        //Listamos la ruta absoluta
        public static void listarDirectorio(File f, String separador){
            File[] ficheros = f.listFiles();

            for (int x=0;x<ficheros.length;x++){
                System.out.println("    " + separador + ficheros[x].getName());

                if (ficheros[x].isDirectory()){
                    String nuevo_separador;
                    nuevo_separador = "     " + separador;
                    listarDirectorio(ficheros[x],nuevo_separador);
                }
            }
        }
        public static void main(String[] args) {
            //3  Realiza un programa que muestre el nombre y tipo (fichero o directorio) de los ficheros y 
            //subdirectorios contenidos en un directorio solicitado al usuario. Mostrar también el contenido de 
            //todos los subdirectorios y si éstos contienen subdirectorios también...y así sucesivamente hasta 
            //mostrar todo el contenido de dicho directorio. 
            String rutaFicehro;
            //Pedimos al usuario la localización de los archivos:
            //Creamos el objeto Scanner para poder recoger la localización del fichero.
            Scanner entradaEscaner = new Scanner(System.in);
            System.out.println("Por favor, introduzca la localización del fichero");
            rutaFicehro = entradaEscaner.nextLine();
            //leemos lo que el usuario ha introducido para usarlo como ruta en del fichero
            //Variable para llamar a la función listarDirectorio
            File directorio = new File(rutaFicehro);
            listarDirectorio(directorio,"=>");
        }

}
