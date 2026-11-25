import java.util.*;
import java.io.*;


public class Main {
    public static int comp(String s1, String s2){

        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if(Character.toLowerCase(a) != Character.toLowerCase(b)){
                if(Character.toLowerCase(a) < Character.toLowerCase(b)){
                    return -1;
                }else{
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        int x = 0;
        System.out.println(comp(s1, s2));
    }
}
