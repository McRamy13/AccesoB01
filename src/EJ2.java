import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by soul on 5/10/16.
 */
public class EJ2 {
    public static void main(String[] args) {
        //2  Realiza un programa que cree un directorio en el directorio actual, luego cree tres ficheros 
        //en dicho directorio donde uno se borre y otro se renombre. Crearle también un subdirectorio con un
        //fichero dentro. Después mostrar la ruta absoluta de ambos directorios y sus contenidos. 
        //Creamos el objeto fichero.
        File directorio = new File("Ejercicio2");
        File subdirectorio = new File(directorio,"subEjercicio");
        File f1 = new File(directorio,"Fichero1.txt");
        File f2 = new File(directorio,"Fichero2.txt");
        File f3 = new File(directorio,"Fichero3.txt");
        File f4 = new File(subdirectorio, "Fichero4.txt");
        directorio.mkdir();

        try {
            if(f1.createNewFile()){
                System.out.println("Fichero1 creado correctamente");
            }else{
                System.out.println("Fichero1 creado correctamente");
            }
            if(f2.createNewFile()){
                System.out.println("Fichero2 creado correctamente");
            }else{
                System.out.println("Fichero2 creado correctamente");
            }
            if(f3.createNewFile()){
                System.out.println("Fichero3 creado correctamente");
            }else{
                System.out.println("Fichero3 creado correctamente");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //Eliminamos el fichero 2
        if (f2.delete()){
            System.out.println("Archivo 2 eliminado correctamente");
        }
        //Renombramos el fichero 3
        if (f3.renameTo(new File(directorio, "F3Renamed.txt"))){
            System.out.println("Fichero3 renombrado");
        }else{
            System.out.println("El fichero3 no se ha podido renombrar");
        }
        //Cremos un subdirectorio nuevo.
        subdirectorio.mkdir();
        //creamos un nuevo archivo
        // para el subdirectorio
        try {
            if(f4.createNewFile()){
                System.out.println("El fichero 4 se ha creado");
            }else{
                System.out.println("El fichero 4 no ha podido ser creado");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Por último, mostramos la ruta del contenido.
        File[] archivos = directorio.listFiles();
        //mostramos todo en un bucle
        for(int i=0; i<=archivos.length; i++){
            System.out.println(archivos[i]);
        }
    }

}
