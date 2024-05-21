package laba12;

import java.time.LocalTime;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } );
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } );
        Thread t3 = new Thread(() -> {
            for (int i = 0; i <10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } );

        Thread t4 = new Thread(() -> {
            for (int i = 0; i <10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } );

        Thread t5 = new Thread(() -> {
            for (int i = 0; i <10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } );

        Thread t6 = new Thread(() -> {
            for (int i = 0; i <10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } );

        Thread t7 = new Thread(() -> {
            for (int i = 0; i <10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } );

        Thread t8 = new Thread(() -> {
            for (int i = 0; i <10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } );

        Thread t9 = new Thread(() -> {
            for (int i = 0; i <10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } );

        Thread t10 = new Thread(() -> {
            for (int i = 0; i <10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } );
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();


        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();

    }
}
