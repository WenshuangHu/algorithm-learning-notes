package algorithm.ConsumerAndProducer;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        System.out.println("Start producing and consuming.");
        new Thread(new Producer(list)).start();
        new Thread(new Consumer(list)).start();
        System.out.println("Main thread is complete.");
    }

    private static class Consumer implements Runnable{
        private final List<String> list;
        Consumer(List<String> list) {
            this.list = list;
        }

        @Override
        public void run(){
            try {
                while (true) {
                    synchronized (list) {
                        if (!list.isEmpty()) {
                            Thread.sleep(1000);
                            System.out.println("Consumer consume: " + list.get(0));
                            list.remove(0);
                            list.notify();
                        } else {
                            list.wait();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static class Producer implements Runnable{
        private final List<String> list;

        Producer(List<String> list) {
            this.list = list;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    synchronized (list) {
                        if (list.isEmpty()) {
                            list.add("a");
                            System.out.println("Producer has produced: a");
                            list.notify();
                        } else {
                            list.wait();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
