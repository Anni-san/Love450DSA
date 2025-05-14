import java.util.Scanner;

public class reversearray {

    static void Approach1(int[] arr) {
        int n = arr.length;
        int temp[] = new int[n];

        for (int i = 0; i < n; i++)
            temp[i] = arr[n - i - 1];

        for (int i = 0; i < n; i++)
            arr[i] = temp[i];

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void Approch2(int arr[]){
        int n=arr.length;
        int left=0,right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void Approch3(int arr[]){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt(); // you must define n after taking input

        int arr[] = new int[n];
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Approach1(arr);
        System.out.println(); // after each approach

        Approach2(arr);
        System.out.println(); // after each approach

        Approach3(arr);
        System.out.println(); // after each approach


        sc.close(); // good practice to close the scanner
    }
}
