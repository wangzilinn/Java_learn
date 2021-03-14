import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 3/11/2021 5:35 PM
 */
public class ThreadLearn {
    private int state;
    private static Lock lock = new ReentrantLock();
    private static Condition c1 = lock.newCondition();
    private static Condition c2 = lock.newCondition();
    private static Condition c3 = lock.newCondition();

    public static void main(String[] args) throws InterruptedException {
        ThreadLearn threadLearn = new ThreadLearn();
        new Thread(threadLearn::print1).start();
        new Thread(threadLearn::print2).start();
        new Thread(threadLearn::print3).start();

    }

    private void print1() {
        for (int i = 0; i < 3;) {
            lock.lock();
            try{
                if (state % 3 != 0) {
                    c1.await();
                }else {
                    System.out.println("1");
                    state++;
                    i++;
                    c2.signal();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }

    private void print2() {
        for (int i = 0; i < 3; ) {
            lock.lock();
            try{
                if (state % 3 != 1) {
                    c2.await();
                }else {
                    System.out.println("2");
                    state++;
                    i++;
                    c3.signal();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }

    private void print3() {
        for (int i = 0; i < 3;) {
            lock.lock();
            try{
                if (state % 3 != 2) {
                    c3.await();
                }else {
                    System.out.println("3");
                    state++;
                    i++;
                    c1.signal();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
}
