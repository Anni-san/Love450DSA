public class swap2sorted_swapandsortMTHD {
        static void mergeArrays(int[] a, int[] b) {
            int i = a.length - 1, j = 0;

            // Swap smaller elements from b[] with larger elements from a[]
            while (i >= 0 && j < b.length) {
                if (a[i] < b[j])
                    i--;
                else {
                    int temp = b[j];
                    b[j] = a[i];
                    a[i] = temp;
                    i--;
                    j++;
                }
            }
            // Sort both arrays
            Arrays.sort(a);
            Arrays.sort(b);
        }

}
