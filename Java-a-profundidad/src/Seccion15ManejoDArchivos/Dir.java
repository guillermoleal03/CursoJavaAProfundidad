package Seccion15ManejoDArchivos;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Dir {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("Debe especificar un directorio");
            System.exit(1);
        }

        File directorio = new File(args[0]);

        System.out.println("Directorio: " + directorio.getAbsolutePath());
        System.out.println("Archivos:");
        Arrays.stream(directorio.listFiles()).forEach(archivo -> {
            System.out.println("\t" + archivo.getName());
        });
    }

}
