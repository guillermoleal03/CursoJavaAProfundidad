package Seccion14Hilos.Punto4;

public class Productor implements Runnable{

    private String material;
    private Mesa mesa;

    public Productor(String material, Mesa mesa) {
        this.material = material;
        this.mesa = mesa;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            if (material.equals("papel")) {
                mesa.ponerPapel();
            } else if (material.equals("tabaco")) {
                mesa.ponerTabaco();
            } else if (material.equals("cerillos")) {
                mesa.ponerCerillos();
            }

            System.out.println("Productor de " + material + " ha producido un elemento.");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Productor de " + material + " ha sido interrumpido mientras producía.");
                Thread.currentThread().interrupt();
            }
        }
    }

}
