package Tanda2.Ejercicio2_5;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Array;


//Crea un fichero

public class manejoFicheros {
    public static void creaFichero(String fichero) throws IOException {
        File creacion = new File(fichero);
        creacion.createNewFile();
    }
//Borra un fichero específico

    public static void borraFichero(String fichero) {
        File borrador = new File(fichero);
        String error = "Error!";
        if (borrador.exists()) {
            System.out.println(error);

        } else {
            System.out.println("Borrado con éxito");
            borrador.delete();
        }

    }
//Crea un directorio

    public static void creaDirectorio(String ruta) throws IOException {
        File mkd = new File(ruta);
        mkd.mkdir();
    }
//Borra todos los directorios

    public static void borraDirectorio(String ruta) {
        File rmdir = new File(ruta);
        String[] comprobacion = rmdir.list();

        if (rmdir.isDirectory()) {

            for (int i = 0; i < comprobacion.length; i++) {
                File borrarUno = new File(ruta.concat("\\" + comprobacion[i]));
                borrarUno.delete();
            }

            rmdir.delete();
        }
    }
//lista los directorios  void listarDirectorio(String ruta):
// lista el contenido del directorio

    public static void listaTotal(String ruta) {
        File listado = new File(ruta);

        //Verificar si la ruta es un directorio
        if (listado.isDirectory()) {
            // Obtiene la lista de archivos y directorios en el directorio
            String[] listDir = listado.list();

            // Verifica si la lista no es nula (puede ser nula si hay un error)
            if (listDir != null) {

                for (int i = 0; i < listDir.length; i++) {
                    System.out.println(listDir[i]);//Imprime cada archivo y directorio
                }
            }else{
                    System.out.println("no hay archivos a listar o hay un error al acceder");
                }
        }else{
                    System.out.println("No hay archivos a listar");
                }


/*----------------EJEMPLO LISTADO---------------------

public class ListaArchivos {
    public static void listaTotal(String ruta) {
        File listado = new File(ruta);

        // Verifica si la ruta es un directorio
        if (listado.isDirectory()) {
            // Obtiene la lista de archivos y directorios en el directorio
            String[] listDir = listado.list();

            // Verifica si la lista no es nula (puede ser nula si hay un error)
            if (listDir != null) {
                for (int i = 0; i < listDir.length; i++) {
                    System.out.println(listDir[i]); // Imprime cada archivo/directorio
                }
            } else {
                System.out.println("No hay archivos a listar o error al acceder.");
            }
        } else {
            System.out.println("La ruta especificada no es un directorio.");
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        listaTotal("ruta/al/directorio"); // Cambia esto por la ruta que quieras listar
    }
}
*/


    }
}



