package Seccion16Sockets;
import java.io.*;
import java.net.*;
import java.util.List;
public class Cliente {
    private static final String SERVIDOR_IP = "localhost";
    private static final int PUERTO = 12345;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(SERVIDOR_IP, PUERTO);
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leerPersonas(ObjectInputStream ois, ObjectOutputStream oos) throws IOException, ClassNotFoundException {
        oos.writeUTF("LEER");
        List<Persona> listaPersonas = (List<Persona>) ois.readObject();
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }

    private static void agregarPersona(ObjectInputStream ois, ObjectOutputStream oos) throws IOException, ClassNotFoundException {
        oos.writeUTF("AGREGAR");

        Persona nuevaPersona = new Persona("pablo",16);
        oos.writeObject(nuevaPersona);

        String respuesta = ois.readUTF();
        System.out.println(respuesta);
    }

    private static void modificarPersona(ObjectInputStream ois, ObjectOutputStream oos) throws IOException {
    }
}
