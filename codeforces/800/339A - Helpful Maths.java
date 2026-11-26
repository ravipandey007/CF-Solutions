import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String s = sc.next();
      //count the no. of digits : 
      int count = 0; 
      for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        if(Character.isDigit(ch)){
          count++;
        }
      }
      int[] arr = new int[count];
      int idx = 0; 
      for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);

        if(Character.isDigit(ch)){
          arr[idx] = ch - '0';
          idx++;
        }
      }
      Arrays.sort(arr);

      for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i]);
        if(i != arr.length - 1){
          System.out.print("+");
        }
      }
    }
}
