package Seccion15ManejoDArchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Mv {

    public static void main(String[] args) throws IOException {
        Path sourceFile = Paths.get(args[0]);
        Path destinationFile = Paths.get(args[1]);

        Files.move(sourceFile, destinationFile);
    }

}
