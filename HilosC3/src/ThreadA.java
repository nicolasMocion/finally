
import javax.swing.JOptionPane;

public class ThreadA extends Thread {
    private Semaphore semaphore;
    private StringBuilder word;

    public ThreadA(StringBuilder word, Semaphore semaphore) {
        this.semaphore = semaphore;
        this.word = word;
    }

    public void run() {
        long endTime = System.currentTimeMillis() + 6000L;
        String word2 = JOptionPane.showInputDialog("Ingrese un dato");

        while(System.currentTimeMillis() < endTime) {
            this.word.append(word2);

            try {
                Thread.sleep(500L);
            } catch (InterruptedException var5) {
                var5.printStackTrace();
            }
        }

        this.semaphore.release();
    }
}
