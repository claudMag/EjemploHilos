package AplicacionConHilos;

public class Hilo extends Thread{

    public Hilo(String nombre){
        setName(nombre);
        System.out.println("Arranca el hilo "+getName());
    }

    @Override
    public void run() {
        //aqui se ejecuta
        for (int i = 0; i < 3000; i++) {
            System.out.println("Soy el hilo "+getName()+" y voy por la pasada numero: "+i);
        }
    }
}
