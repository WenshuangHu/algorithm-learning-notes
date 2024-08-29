package algorithm.ConsumerAndProducer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Solution4 {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        Semaphore semaphore = new Semaphore(1);
        System.out.println("Start producing and consuming.");
        new Thread(new Producer(list, semaphore)).start();
        new Thread(new Consumer(list, semaphore)).start();
        System.out.println("Main thread is complete.");
    }

    private static class Consumer implements Runnable{
        private final List<String> list;
        private final Semaphore semaphore;
        Consumer(List<String> list, Semaphore semaphore) {
            this.list = list;
            this.semaphore = semaphore;
        }

        @Override
        public void run(){
            try {
                semaphore.acquire();
                if (!list.isEmpty()) {
                    Thread.sleep(1000);
                    System.out.println("Consumer consume: " + list.get(0));
                    list.remove(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }

    private static class Producer implements Runnable{
        private final List<String> list;
        private final Semaphore semaphore;
        Producer(List<String> list, Semaphore semaphore) {
            this.list = list;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                if (list.isEmpty()) {
                    list.add("a");
                    System.out.println("Producer has produced: a");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }
}
