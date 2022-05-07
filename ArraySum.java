import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArraySum {
    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> slr = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String str = "";
        str = sc.nextLine();
        Scanner sc1 = new Scanner(str);
        boolean flag = false;
        while (sc1.hasNext()){
            String token = sc1.next();
            try{
                arr.add(Integer.parseInt(token));
                flag = true;
            }catch (Exception e){
                slr.add(token);
            }
        }
        if (flag){
            int sum = 0;
            for (int i:arr) {
                sum += i;
            }
            System.out.println(sum);
        }else{
            StringBuilder st = new StringBuilder();
            for (String s:slr) {
                st.append(s);
            }
            System.out.println(st);
        }
    }
}