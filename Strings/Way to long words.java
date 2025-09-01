import java.util.*;

public class Problem266A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;
        String result = "";
        for(int i=0; i< n; i++)
        {
          s = sc.next();
          int len = s.length();
          if(len > 10)
          {
            System.out.println(s.charAt(0) + String.valueOf(len - 2) + s.charAt(len-1));
          }
          else 
          {
            System.out.println(s);
          }
        }
    }
}
