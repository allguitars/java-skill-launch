package com.cddrm.javasnippets.thread.se14book_demo;

// 進入 Blocked 狀態的執行緒（例如呼叫了 sleep()） 可以由另一個執行緒呼叫該執行緒的 interrupt() 方法
// 讓它離開 Blocked 狀態  這是讓謢行緒醒過來的方式
public class Demo05Interrupt {

    public static void main(String[] args) throws InterruptedException {

        var thread = new Thread(() -> {
            try {
                Thread.sleep(99999);
            } catch (InterruptedException e) {
                throw new RuntimeException("I am awake!");
            }
        });

        thread.start();

        // wake up the thread (unblock it)
        thread.interrupt();
    }
}
