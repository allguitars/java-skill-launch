package com.cddrm.javasnippets.thread.se14book_demo;

// 若有 Thread 播標示為 Daemon 執行緒
// 在非 Daemon 執行緒都結束時  JVM 就會終止
public class Demo04DaemonThread {

    public static void main(String[] args) {

        var thread = new Thread(() -> {
            while (true) {
                System.out.println("Hello");
            }
        });

        // When the main thread finishes execution, JVM will force daemon threads to stop.
        // On the other hand, if we don't set this thread as a daemon thread, it will
        // run endlessly because it is not considered as a background task.
        // So, we can see the daemon threads as second-class citizens
        thread.setDaemon(true);

        thread.start();

        System.out.println("Reaches the final step of the main method");
    }
}
