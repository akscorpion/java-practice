import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder sb = new StringBuilder(A);
        /* Enter your code here. Print output to STDOUT. */
        if(A.equals(sb.reverse().toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}