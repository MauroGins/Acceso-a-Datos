package Tanda2.Ejercicio2_5;

import java.io.File;
import java.io.IOException;

public class manejoFicheros {
    public static void creaFichero(String fichero) throws IOException {
        File creacion = new File(fichero);
        creacion.createNewFile();
    }

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

    public static void creaDirectorio(String ruta) throws IOException {
        File mkd = new File(ruta);
        mkd.mkdir();
    }

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

    public static void listaTotal(String ruta) {
        File todo = new File(ruta);



            todo.delete();;
        }



}
