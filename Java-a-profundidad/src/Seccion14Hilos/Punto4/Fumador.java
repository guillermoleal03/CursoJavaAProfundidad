package Seccion14Hilos.Punto4;

public class Fumador implements Runnable{

    private String material;
    private Mesa mesa;

    public Fumador(String material, Mesa mesa) {
        this.material = material;
        this.mesa = mesa;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                mesa.esperarFumar();

                System.out.println("Fumador con " + material + " está fumando.");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Fumador con " + material + " ha sido interrumpido mientras fumaba.");
                    Thread.currentThread().interrupt();
                }

                System.out.println("Fumador con " + material + " ha terminado de fumar.");

                mesa.esperarFumar();
            }
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

}
