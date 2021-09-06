package examples.request_queue_example;

import java.util.LinkedList;
import java.util.Queue;

public class ProcessRequestDemo {

    public static void main(String[] args) {
        Queue<Request> requests = new LinkedList<>();
        offerRequestsTo(requests);
        process(requests);
    }

    static void offerRequestsTo(Queue<Request> requests) {
        // Simulate adding new request objects to the queue
        for (int i = 1; i < 6; i++) {
            Request request = new Request() {
                @Override
                public void execute() {
                    System.out.println("Processing: " + Math.random());
                }
            };
            requests.offer(request);
        }
    }

    static void process(Queue<Request> requests) {
        while (requests.peek() != null) {
            Request request = requests.poll();
            request.execute();
        }
    }
}
