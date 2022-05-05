package com.cddrm.javasnippets.thread.se14book_demo;

// 建立 thread 的第二個方法是繼承 Thread 類別
// 然後覆寫 run() 方法
// 其實兩種方法比較起來  實作 Runnable 比較有彈性  因為類別還有機會繼承其他類別
// 若繼承了 Thread (如此例)  那該類別就是一個 Thread
// 通常是為了利用 Thread 所定義的方法  才回繼承 Thread 類別來實作
public class Demo02CreateThreadSecondWay {

    public static void main(String[] args) {

        // Thread instance
        // there is no need to pass in the Runnable instance
        Thread threadA = new MyThreadA();
        Thread threadB = new MyThreadB();

        // execute run() by calling start()
        threadA.start();
        threadB.start();

        // This line will appear immediately because it runs in the main thread
        System.out.println("This line is run after the thread starts executing");
    }
}

class MyThreadA extends Thread {

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

class MyThreadB extends Thread {

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