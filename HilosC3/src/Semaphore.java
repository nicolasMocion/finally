public class Semaphore {
    private int permits;

    public Semaphore(int permits) {
        this.permits = permits;
    }

    public synchronized void acquire() throws InterruptedException {
        while(this.permits == 0) {
            this.wait();
        }

        --this.permits;
    }

    public synchronized void release() {
        ++this.permits;
        this.notify();
    }
}
