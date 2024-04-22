import java.util.ArrayList;

public class Hilo2 extends Thread{

    int current;

    public Hilo2 (int current){
        this.current = current;
    }

    @Override
    public void run() {
        System.out.println(sumarAsiMismo(current, 10));
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static int sumarAsiMismo(int number, int times){

        if(times == 0){
            return 0;
        }

        else{
            return sumarAsiMismo(number, times - 1) + number;
        }

    }

}
