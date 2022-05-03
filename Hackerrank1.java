import java.util.Scanner;

public class Hackerrank1 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        smallest = s.substring(0,k);
        largest = smallest;

        for (int i = 0; i < s.length() - k + 1; i++){
            String substring = s.substring(i, i + k);
            if (smallest.compareTo(substring) > 0){
                smallest = substring;
            }
            if (largest.compareTo(substring) < 0){
                largest = substring;
            }
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}