import java.util.*;

public class SumSubarray {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[sc.nextInt()];

    arr[0] = sc.nextInt();
    int count = arr[0] < 0 ? 1 : 0;

    for (int i = 1; i < arr.length; i++){
        int num = sc.nextInt();
        arr[i] = arr[i - 1] + num;

        if (arr[i] < 0){
            count++;
        }

        for (int j = 0; j < i; j++){
            int sub_result = arr[i] - arr[j];
            if (sub_result < 0){
                count++;
            }
        }
    }
    System.out.print(count);}
}
