import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 12/21/2020 11:42 AM
 */
public class ThreadPoolLearn {
    public static void main(String[] args) {
        new ReentrantLock();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        reentrantReadWriteLock.writeLock().lock();
        reentrantReadWriteLock.writeLock().unlock();
        reentrantReadWriteLock.readLock().lock();
        reentrantReadWriteLock.readLock().unlock();
        Executors.newCachedThreadPool();
    }
}
