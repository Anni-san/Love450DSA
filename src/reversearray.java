import java.sql.SQLOutput;
import java.util.Scanner;
import java.utils.*;
public class reversearray {
    static void Approch1(int [] arr){
        int n= arr.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
            temp[i]=arr[n-i-1];
        for(int i=0;i<n;i++)
            arr[i] = temp[i];
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
            }
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n;
            int arr[]=new int[n];
            System.out.println("Enter elements in the array");
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            Approch1(arr);
        }
    }

