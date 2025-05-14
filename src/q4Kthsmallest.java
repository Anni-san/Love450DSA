public class q4Kthsmallest {
    public static int approch1(int[] arr, int k) {
        // Your code here
        Arrays.sort(arr);
        return arr[k-1];
    }
    //Second Method is to be done by uisng the Priority Queue method ie MinHeap
    public static int kthSmallest(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            maxHeap.add(num);

            // Keep only k elements in the heap
            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove the largest
            }
        }

        // The root of the max-heap is the k-th smallest element
        return maxHeap.peek();
    }
    //third can be by Counting Sort
}
