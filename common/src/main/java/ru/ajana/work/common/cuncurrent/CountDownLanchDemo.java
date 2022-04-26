package ru.ajana.work.common.cuncurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Andrey Kharintsev on 23.03.2018
 */
public class CountDownLanchDemo {

    public static void main() {
        CountDownLatch downLatch = new CountDownLatch(2);
        downLatch.countDown();

        Executors.newSingleThreadExecutor()
        {
            ReentrantLock lock = new ReentrantLock(true);
            lock.lock();
            lock.tryLock();
            lock.unlock();
        }

        {
            ReadWriteLock lock = new ReentrantReadWriteLock();
            lock.readLock().unlock();

            lock.writeLock().unlock();
        }

        int countThread = 3;
        CyclicBarrier barrier = new CyclicBarrier(countThread, () -> System.out.println("1"));
        barrier
        barrier.await()

        Executors.newFixedThreadPool(n)

    }
}
