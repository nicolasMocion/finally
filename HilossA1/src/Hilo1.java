import java.util.ArrayList;

public class Hilo1 extends Thread{

    ArrayList<String> array;

    public Hilo1 (ArrayList<String> array){
        this.array = array;
    }

    @Override
    public void run() {

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
