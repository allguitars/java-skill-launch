package com.cddrm.javasnippets.thread.se14book_demo;

// 方法一中  建立 Thread 實例時其建構式需要傳入 Runnable 實例
// 在某些情況下可以使用匿名類別來建構 Thread
// Thread 建構式接受一個 Runnable 實例  而實作 Runnable 介面只需要提供單一方法 run() 的實作
// 故可用 Lambda 表示式
public class Demo03AnonymousClassWithLambda {

    public static void main(String[] args) {

        // 一般匿名類別的語法建構 Thread
        var thread1 = new Thread() {
            public void run() {
                System.out.println("Running a thread");
            }
        };

        thread1.start();

        // 使用 Lambda 表示式
        var thread2 = new Thread(() -> {
            System.out.println("Running a thread");
        });

        thread2.start();
    }
}
