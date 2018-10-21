package ru.ajana.work.tread;

/**
 * Created by Андрей on 20.12.2015.
 */
public class NewThread {

    String name; // имя потока
    Thread t;
    boolean suspendFlag;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(name);
        System.out.println("Новый поток: " + t);
        suspendFlag = false;
        t.start();
        // запустить поток
    }

    // Точка входа потока.
    public void run() {
        try {
            for (int i = 15; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }

    void start() {
        suspendFlag = true;
    }

    synchronized void stop()
    {
        suspendFlag = false;
        notify();
    }
}


class SuspendResume {
    public static void main(String args[]) throws InterruptedException {
        NewThread obi = new NewThread("Один");
        NewThread ob2 = new NewThread("Два");
        try {
            Thread.sleep(1000);
            obi.start();
            System.out.println("Приостановка потока Один");
            Thread.sleep(1000);
            obi.stop();
            System.out.println("Возобновление потока Один");
            ob2.start();
            System.out.println("Приостановка потока Два");
            Thread.sleep(1000);
            ob2.stop();
            System.out.println("Возобновление потока Два");
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
            // ожидание завершения потоков try {
            System.out.println("Ожидание завершения потоков.");
            obi.t.join();
            ob2.t.join();
        }
        System.out.println("Главный поток завершен");
        }
    }
