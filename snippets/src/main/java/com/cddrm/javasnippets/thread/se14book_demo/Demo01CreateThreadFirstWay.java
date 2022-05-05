package com.cddrm.javasnippets.thread.se14book_demo;

// 建立 thread 的第一個方法是實作 Runnable 介面的 run() 方法
// 然後將 Runnable 實例傳入 Thread 類別的建構式產生 Thread 實例
// 接著呼叫 Thread 實例的 start() 方法，就會執行 Runnable 實例的 run() 內容。
public class Demo01CreateThreadFirstWay {

    public static void main(String[] args) {

        // Runnable instance
        Runnable runnableA = new MyRunnableA();
        Runnable runnableB = new MyRunnableB();

        // Thread instance
        Thread thread1 = new Thread(runnableA);
        Thread thread2 = new Thread(runnableB);

        // execute run() by calling start()
        thread1.start();
        thread2.start();

        // This line will appear immediately because it runs in the main thread
        System.out.println("This line is run after the thread starts executing");
    }
}

class MyRunnableA implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            double pauseDuration = 1 + Math.random() * 2;
            int pauseMillisecond = (int) (pauseDuration * 1000);

            try {
                Thread.sleep(pauseMillisecond);
                System.out.println("A Paused for " + pauseMillisecond + " millisecond");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnableB implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            double pauseDuration = 1 + Math.random() * 2;
            int pauseMillisecond = (int) (pauseDuration * 1000);

            try {
                Thread.sleep(pauseMillisecond);
                System.out.println("B Paused for " + pauseMillisecond + " millisecond");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}