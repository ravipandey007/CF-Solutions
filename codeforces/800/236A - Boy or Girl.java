import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      String s = sc.next();
      int count = 0;
      int[] freq = new int[26];

      for(int i = 0; i < s.length(); i++){
        freq[s.charAt(i) - 'a']++;
      }

      for(int i = 0; i < 26; i++){
        if(freq[i] > 0){
          count++;
        }
      }
      if(count % 2 == 0){
        //even
        System.out.println("CHAT WITH HER!");
      }else{
        //odd
        System.out.println("IGNORE HIM!");
      }
    }
}
