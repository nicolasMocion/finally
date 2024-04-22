import java.util.ArrayList;

public class Main implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> prueba1 = new ArrayList<>();

        prueba1.add("Ferrari");
        prueba1.add("MClaren");
        prueba1.add("RedBull");

        Hilo1 hilo1 = new Hilo1(prueba1);
        Hilo2 hilo2 = new Hilo2(5);
        Hilo3 hilo3 = new Hilo3();
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }

    @Override
    public void run() {

    }
}