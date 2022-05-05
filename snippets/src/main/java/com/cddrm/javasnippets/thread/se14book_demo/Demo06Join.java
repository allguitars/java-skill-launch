package com.cddrm.javasnippets.thread.se14book_demo;

// 如果 A 執行緒正在運行，流程中允許 B 執行緒加入，等 B 執行緒執行完再繼續 A 執行緒流程，
// 可以使用 join() 方法
public class Demo06Join {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread started...\n");

        var myThread = new Thread(() -> {
            System.out.println("My thread started...");
            for (int i = 0; i < 5; i++) {
                System.out.println("Running my thread...");
            }
            System.out.println("My thread is ending...\n");
        });

        myThread.start();

        // 如果沒有加這一行允許 myThread 插隊，則會先看到 "Main thread is ending 字樣先印出"
        myThread.join();

        System.out.println("Main thread is ending...\n");
    }
}
