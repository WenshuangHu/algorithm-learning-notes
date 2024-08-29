package algorithm.ConsumerAndProducer;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Solution3{

    private static Integer MAX = 1;

    private static Lock lock = new ReentrantLock();

    private static Condition condition = lock.newCondition();

    private static AtomicInteger integer = new AtomicInteger(0);

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        new Thread(new Consumer(list)).start();
        new Thread(new Producer(list)).start();
        new Thread(new Producer(list)).start();
    }

    static class Consumer implements Runnable {

        private List<String> list;

        public Consumer(List<String> list) {
            this.list = list;
        }

        @Override
        public void run() {
            while (true) {
                lock.lock();
                try {
                    if (list.size() <= 0) {
                        System.out.println("Consumer waits");
                        condition.await();
                    } else {
                        String value = list.get(0);
                        list.remove(0);
                        System.out.println(Thread.currentThread().getName() + " 消费者 消费：" + value);
                        condition.signalAll();
                    }
                    Thread.sleep(100);
                } catch (Exception e) {

                } finally {
                    lock.unlock();
                }
            }
        }
    }

    static class Producer implements Runnable {

        private List<String> list;

        public Producer(List<String> list) {
            this.list = list;
        }

        @Override
        public void run() {
            while (true) {
                lock.lock();
                try {
                    if (list.size() <= MAX) {
                        String value = "苹果" + integer.getAndIncrement();
                        list.add(value);
                        System.out.println(Thread.currentThread().getName() + " 生产者 生产：" + value);
                       // condition.signalAll();
                    } else {
                        condition.await();
                    }
                    Thread.sleep(300);
                } catch (Exception e) {

                } finally {
                    lock.unlock();
                }
            }
        }
    }

}