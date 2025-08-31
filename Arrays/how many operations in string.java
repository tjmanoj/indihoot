public class Problem266A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String s = sc.next();
        
        StringBuilder sb = new StringBuilder();
        
        for(char c: s.toCharArray())
        {
          int len = sb.length();
          if(len == 0 || sb.charAt(len - 1) != c)
          {
            sb.append(c);
          }
          else 
          {
            sb.deleteCharAt(len - 1);
            sb.append(c);
          }
        }
        System.out.println(n - sb.length());
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
