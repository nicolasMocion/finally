import java.util.ArrayList;

public class Hilo3 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(Thread.currentThread().getName() + " Iteracion numero: " + (i +1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
