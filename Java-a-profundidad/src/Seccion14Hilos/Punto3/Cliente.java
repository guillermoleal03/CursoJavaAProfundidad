package Seccion14Hilos.Punto3;
class Cliente implements Runnable {
    private CuentaBancaria cuenta;
    private String nombre;

    public Cliente(CuentaBancaria cuenta, String nombre) {
        this.cuenta = cuenta;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            double monto = Math.random() * 1000;
            cuenta.retirarDinero(nombre, monto);
        }
    }
}
