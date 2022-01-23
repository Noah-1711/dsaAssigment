package dsaassignment;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFromDataStream {
	private Queue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
    private Queue<Integer> minHeap = new PriorityQueue();

    public void addNum(int num) {
        if (maxHeap.size() == minHeap.size()) {
            minHeap.add(num);
            maxHeap.add(minHeap.remove());
        } else if (maxHeap.size() > minHeap.size()) {
            maxHeap.add(num);
            minHeap.add(maxHeap.remove());
        } 
    }

    public double findMedian() {
        if (maxHeap.isEmpty()) {
            return 0;
        } else if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return maxHeap.peek();
        }
    }
    public static void main(String args[]) {
    	MedianFromDataStream medianFinder = new MedianFromDataStream();
    	medianFinder.addNum(1);    
    	medianFinder.addNum(2);
    	System.out.println(medianFinder.findMedian());
        medianFinder.addNum(3);    
        System.out.println(medianFinder.findMedian());
    }
}
