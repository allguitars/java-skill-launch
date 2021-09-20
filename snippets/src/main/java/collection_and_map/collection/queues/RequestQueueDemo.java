package collection_and_map.collection.queues;

import java.util.LinkedList;
import java.util.Queue;

public class RequestQueueDemo {

    public static void main(String[] args) {
        // LinkedList also implements Queue so LinkedList can be seen as a kind of Queue.
        Queue requests = new LinkedList();
        offerRequestsTo(requests);
        process(requests);
    }

    static void offerRequestsTo(Queue requests) {
        // Simulates offering coming requests to the queue
        for (int i = 1; i < 6; i++) {
            // You can actually implement the interface while using it
            // So every instance will have its own implementation of the same method
            Request request = new Request() {
                @Override
                public void execute() {
                    System.out.println("Process data: "+ Math.random());
                }
            };
            // Queue or LinkedList provides offer method to place a new element at the end of the queue
            requests.offer(request);
        }
    }

    static void process(Queue requests) {
        // Queue or LinkedList provides peek method for getting the element at the beginning
        // of the queue while not removing it from the queue
        while (requests.peek() != null) {
            // poll method will get the front element and actually remove it from the queue
            Request request = (Request) requests.poll();
            request.execute();
        }
    }
}

interface Request {
    void execute();
}
