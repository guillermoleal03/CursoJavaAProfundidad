package Seccion14Hilos.Punto3;

public class TransaccionesBancarias {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(5000);

        Thread[] clientes = new Thread[5];

        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Thread(new Cliente(cuenta, "Cliente-" + (i + 1)));
            clientes[i].start();
        }

        for (Thread cliente : clientes) {
            try {
                cliente.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Todas las transacciones han sido completadas.");
    }

}
