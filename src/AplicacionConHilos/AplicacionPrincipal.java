package AplicacionConHilos;

public class AplicacionPrincipal {
    //2 formas de montar hilos.
    // 1- heredando de Thread
    // 2- implementando Runnable (si ya estas heredando de otra clase!!)

    public static void main(String[] args) {
        System.out.println("Soy el main y voy a arrancar los hilos");
        Hilo hilo1 = new Hilo("hilo1");
        Hilo hilo2 = new Hilo("hilo2");
        hilo1.start(); //para que se ejecute el run
        hilo2.start();
    }
}
