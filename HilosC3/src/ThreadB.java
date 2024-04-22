
public class ThreadB extends Thread {
    private Semaphore semaphore;
    private StringBuilder word;

    public ThreadB(StringBuilder word, Semaphore semaphore) {
        this.word = word;
        this.semaphore = semaphore;
    }

    public void run() {
        try {
            this.semaphore.acquire();
            System.out.println("Concatenated word: " + this.word.toString());
            this.word.setLength(0);
        } catch (InterruptedException var2) {
            var2.printStackTrace();
        }

    }
}
