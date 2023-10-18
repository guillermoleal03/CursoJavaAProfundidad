package Seccion14Hilos.Punto1Y2;

public class ContadorRegresivo implements Runnable {

    private String nombre;
    private int numero;

    public ContadorRegresivo(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override
    public void run() {
        try {
            int tiempoEspera = (int) (Math.random() * 5000) + 1000;
            System.out.println(nombre + " comenzó. Tiempo de espera: " + tiempoEspera + " ms");

            Thread.sleep(tiempoEspera);

            System.out.println(nombre + " terminó. Contador: " + numero);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread[] hilos = new Thread[10];

        for (int i = 0; i < hilos.length; i++) {
            String nombreHilo = "Hilo-" + (i + 1);
            int numeroInicial = 10;

            ContadorRegresivo contadorRegresivo = new ContadorRegresivo(nombreHilo, numeroInicial);
            hilos[i] = new Thread(contadorRegresivo);
            hilos[i].start();
        }

        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Todos los hilos han terminado.");
    }

}
