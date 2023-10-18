package Seccion14Hilos.Punto3;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void retirarDinero(String cliente, double monto) {
        if (monto <= 0) {
            System.out.println(cliente + ": Error - Monto no válido");
            return;
        }

        if (saldo < monto) {
            System.out.println(cliente + ": Saldo insuficiente");
            return;
        }

        saldo -= monto;

        System.out.println(cliente + ": Retiro exitoso. Monto retirado: " + monto + ". Saldo restante: " + saldo);
    }

}
