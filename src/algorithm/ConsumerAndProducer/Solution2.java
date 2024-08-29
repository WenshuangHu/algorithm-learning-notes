package algorithm.ConsumerAndProducer;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Solution2 {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(2);
        System.out.println("Start producing and consuming.");
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
        System.out.println("Main thread is complete.");
    }

    private static class Consumer implements Runnable{
        private final LinkedBlockingQueue<String> queue;
        Consumer(LinkedBlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run(){
            try {
                while (true) {
                    Thread.sleep(5000);
                    System.out.println("Consumer consume: " + queue.take());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static class Producer implements Runnable{
        private final LinkedBlockingQueue<String> queue;

        Producer(LinkedBlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    queue.put("a");
                    Thread.sleep(1000);
                    System.out.println("Producer has produced: a");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
