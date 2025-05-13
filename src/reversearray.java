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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt(); // you must define n after taking input

        int arr[] = new int[n];
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Approach1(arr);

        sc.close(); // good practice to close the scanner
    }
}
