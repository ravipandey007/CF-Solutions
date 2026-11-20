import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
      
      for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               int x = sc.nextInt();
              if(x == 1){
                ans = Math.abs(i - 2) + Math.abs(j - 2);
              }
            }
        }
      System.out.println(ans);
      }
}
