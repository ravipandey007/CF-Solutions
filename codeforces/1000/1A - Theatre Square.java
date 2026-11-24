import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      long n = sc.nextLong();
      long m = sc.nextLong();
      long a = sc.nextLong();

      long x = (m + a - 1)/a;
      long y = (n + a - 1)/a;

      System.out.println(x * y);
    }
}
