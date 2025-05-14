public class sort012array {
    public class reverseArray {
        //
// Function to sort an array of 0s, 1s, and 2s
        public void sort012ap1(int[] arr) {
            // code here
            int n=arr.length;
            Arrays.sort(arr);
        }
        public void sort012ap2(int arr[]){
            int c1=0,c2=0,c0=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0)
                    c0+=1;
                else if(arr[i]==1)
                    c1+=1;
                else
                    c2+=1;
            }
            int idx=0;
            for(int i=0;i<c0;i++){
                arr[idx]=0;
                idx++;
            }
            for(int i=0;i<c1;i++){
                arr[idx]=1;
                idx++;
            }
            for(int i=0;i<c2;i++){
                arr[idx]=2;
                idx++;
            }
        }
        public static void sort012ap3_dutchnationalflag(int[] arr) {
            int n = arr.length;
            int lo = 0;
            int hi = n - 1;
            int mid = 0, temp = 0;

            // Iterate till all the elements are sorted
            while (mid <= hi) {
                if (arr[mid] == 0) {
                    swap(arr, mid, lo);
                    lo++;
                    mid++;
                }
                else if (arr[mid] == 1) {
                    mid++;
                }
                else {
                    swap(arr, mid, hi);
                    hi--;
                }
            }
        }

        static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
}
