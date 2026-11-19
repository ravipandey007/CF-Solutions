import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int x = sc.nextInt();
      

      int[] arr = new int[n];
      for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
      }

      int ans = arr[x-1];
      int count = 0;

      for(int i = 0; i < n; i++){
        if(arr[i] >= ans && arr[i] > 0){
          count++;
        }
      }
      System.out.println(count);
    }
}
