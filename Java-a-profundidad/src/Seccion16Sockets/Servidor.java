package Seccion16Sockets;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
    public class Servidor {
        private static final int PUERTO = 12345;
        private static List<Persona> listaPersonas = new ArrayList<>();

        public static void main(String[] args) {
            try {
                ServerSocket serverSocket = new ServerSocket(PUERTO);
                System.out.println("Servidor esperando conexiones...");

                while (true) {
                    Socket socket = serverSocket.accept();
                    System.out.println("Cliente conectado desde " + socket.getInetAddress());

                    ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

                    String opcion = ois.readUTF();

                    switch (opcion) {
                        case "LEER":
                            oos.writeObject(listaPersonas);
                            break;
                        case "AGREGAR":
                            Persona nuevaPersona = (Persona) ois.readObject();
                            listaPersonas.add(nuevaPersona);
                            oos.writeUTF("Persona agregada exitosamente.");
                            break;
                        case "MODIFICAR":
                            // Lógica para modificar persona
                            break;
                        case "SALIR":
                            guardarListaEnArchivo();
                            socket.close();
                            serverSocket.close();
                            System.out.println("Servidor cerrado.");
                            System.exit(0);
                            break;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        private static void guardarListaEnArchivo() {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas.dat"))) {
                oos.writeObject(listaPersonas);
                System.out.println("Lista de personas guardada en archivo.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
