
public class Main {
    public Main() {
    }

    public static void main(String[] args) throws InterruptedException {
        Hilo1 hilo1 = new Hilo1(10);
        Hilo2 hilo2 = new Hilo2(6);
        Hilo3 hilo3 = new Hilo3("mmmamsmasmamsamsamsamsmasma");
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo1.join();
        hilo2.join();
        hilo3.join();
        int a = hilo1.result;
        int b = hilo2.result;
        int c = hilo3.result;
        int d = a * b;
        System.out.println("La cantidad de consonantes es: " + c + " y d tiene un valor de: " + d);
    }
}
