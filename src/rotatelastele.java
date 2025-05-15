public class rotatelastele {
        public void approch1(int[] arr) {
            // code here
            int n=arr.length;
            int last=arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=last;
        }
        public void rotate(int[] arr){
            int n=arr.length;
            int i=0;
            int j=n-2;
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            int k=0;
            int m=n-1;
            while(k<m){
                int temp=arr[k];
                arr[k]=arr[m];
                arr[m]=temp;
                k++;
                m--;
            }
        }
    }
