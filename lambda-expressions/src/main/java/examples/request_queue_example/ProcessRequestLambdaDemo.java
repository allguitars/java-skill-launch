package examples.request_queue_example;

import java.util.LinkedList;
import java.util.Queue;

public class ProcessRequestLambdaDemo {

    public static void main(String[] args) {
        Queue<Request> requests = new LinkedList<>();
        offerRequestsTo(requests);
        process(requests);
    }

    static void offerRequestsTo(Queue<Request> requests) {
        // Simulate adding new request objects to the queue
        for (int i = 1; i < 6; i++) {
            // 1:
//            Request request =
//                () -> System.out.println("Processing: " + Math.random());
//            requests.offer(request);

            // 2: Even shorter
            // Lambda does two things:
            // (a) implements the ONLY method in the interface
            // (b) returns a new instance based on the implementation
            requests.offer(
                    () -> System.out.println("Processing: " + Math.random())
            );
        }
    }

    static void process(Queue<Request> requests) {
        while (requests.peek() != null) {
            Request request = requests.poll();
            request.execute();
        }
    }
}
