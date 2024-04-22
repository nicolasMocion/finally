
public class Hilo1 extends Thread {
    int number;
    int result;

    public Hilo1(int number) {
        this.number = number;
    }

    public void run() {
        this.result = sumarEnterosR(this.number);
        System.out.println(this.result);
    }

    public static int sumarEnterosR(int number) {
        return number == 0 ? 0 : sumarEnterosR(number - 1) + number;
    }
}
