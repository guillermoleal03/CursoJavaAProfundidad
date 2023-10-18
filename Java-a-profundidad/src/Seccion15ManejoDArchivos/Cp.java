package Seccion15ManejoDArchivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Cp {
    public static void main(String[] args) throws IOException {
        String sourceFile = args[0];
        String destinationFile = args[1];

        File inFile = new File(sourceFile);
        File outFile = new File(destinationFile);

        FileInputStream in = new FileInputStream(inFile);
        FileOutputStream out = new FileOutputStream(outFile);

        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }

        in.close();
        out.close();
    }
}
