import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String s = sc.next();
      char ch = s.charAt(0);

      if(ch >= 'a' && ch <= 'z'){
        ch = (char)(ch - 32);
      }
      System.out.print(ch);
      for(int i = 1; i < s.length(); i++){
        System.out.print(s.charAt(i));
      }
    }
}
