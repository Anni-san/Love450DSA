public class negatend {
    public void segregateElements(int[] arr) {
        Stack<Integer> neg = new Stack<>();
        Stack<Integer> pos = new Stack<>();

        // First pass: separate positives and negatives
        for (int value : arr) {
            if (value < 0) {
                neg.push(value);
            } else {
                pos.push(value);
            }
        }

        // Second pass: fill array from left to right with positives first
        int i = 0;
        Stack<Integer> tempPos = new Stack<>();
        while (!pos.isEmpty()) {
            tempPos.push(pos.pop()); // reverse order
        }
        while (!tempPos.isEmpty()) {
            arr[i++] = tempPos.pop();
        }

        Stack<Integer> tempNeg = new Stack<>();
        while (!neg.isEmpty()) {
            tempNeg.push(neg.pop()); // reverse order
        }
        while (!tempNeg.isEmpty()) {
            arr[i++] = tempNeg.pop();
        }
    }
}
