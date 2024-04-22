public class Hilo2 extends Thread {
    int number;
    int result;

    public Hilo2(int number) {
        this.number = number;
    }

    public void run() {
        this.result = calcularFactorial(this.number);
        System.out.println(this.result);
    }

    public static int calcularFactorial(int number) {
        return number == 1 ? 1 : calcularFactorial(number - 1) * number;
    }
}
