package Seccion14Hilos.Punto4;

import java.util.concurrent.Semaphore;

public class Mesa {
    private Semaphore papel = new Semaphore(0);
    private Semaphore tabaco = new Semaphore(0);
    private Semaphore cerillos = new Semaphore(0);
    private Semaphore mutex = new Semaphore(1);

    public void ponerPapel() {
        papel.release();
    }

    public void ponerTabaco() {
        tabaco.release();
    }

    public void ponerCerillos() {
        cerillos.release();
    }

    public void esperarFumar() throws InterruptedException {
        mutex.acquire();
        mutex.release();
    }

    public void esperarPapel() throws InterruptedException {
        papel.acquire();
    }

    public void esperarTabaco() throws InterruptedException {
        tabaco.acquire();
    }

    public void esperarCerillos() throws InterruptedException {
        cerillos.acquire();
    }
}
