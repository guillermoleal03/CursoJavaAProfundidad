package Seccion14Hilos.Punto1Y2;

public class ContadorRegresivo30 implements Runnable {

    private String nombre;
    private int numero;

    public ContadorRegresivo30(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override
    public void run() {
        try {
            int tiempoEspera = 3000;
            System.out.println(nombre + " comenzó. Tiempo de espera: " + tiempoEspera + " ms");

            Thread.sleep(tiempoEspera);

            System.out.println(nombre + " terminó. Contador: " + numero);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread[] hilos = new Thread[30];

        for (int i = 0; i < hilos.length; i++) {
            String nombreHilo = "Hilo-" + (i + 1);
            int numeroInicial = 10;

            ContadorRegresivo contadorRegresivo = new ContadorRegresivo(nombreHilo, numeroInicial);
            hilos[i] = new Thread(contadorRegresivo);

            hilos[i].setPriority(Thread.MIN_PRIORITY + i % (Thread.MAX_PRIORITY - Thread.MIN_PRIORITY + 1));

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
