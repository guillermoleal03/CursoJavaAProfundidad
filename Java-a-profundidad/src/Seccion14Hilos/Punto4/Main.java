package Seccion14Hilos.Punto4;

public class Main {
    public static void main(String[] args) {
        Mesa mesa = new Mesa();

        Thread fumadorPapel = new Thread(new Fumador("papel", mesa));
        Thread fumadorTabaco = new Thread(new Fumador("tabaco", mesa));
        Thread fumadorCerillos = new Thread(new Fumador("cerillos", mesa));

        Thread productorPapel = new Thread(new Productor("papel", mesa));
        Thread productorTabaco = new Thread(new Productor("tabaco", mesa));
        Thread productorCerillos = new Thread(new Productor("cerillos", mesa));

        fumadorPapel.start();
        fumadorTabaco.start();
        fumadorCerillos.start();

        productorPapel.start();
        productorTabaco.start();
        productorCerillos.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        fumadorPapel.interrupt();
        fumadorTabaco.interrupt();
        fumadorCerillos.interrupt();

        productorPapel.interrupt();
        productorTabaco.interrupt();
        productorCerillos.interrupt();
    }
}
