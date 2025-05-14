import java.util.PriorityQueue;
public class kthlargest {

    public int kthLargest(int[] arr, int k) {
        // Min-heap to keep the k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);

            // Keep only k elements in the heap
            if (minHeap.size() > k) {
                minHeap.poll(); // remove the smallest
            }
        }

        // The root of the min-heap is the k-th largest element
        return minHeap.peek();
    }
}