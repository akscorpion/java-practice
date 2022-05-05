import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,4};
        int i = 0;
        int ind;
        Scanner sc = new Scanner(System.in);
        while (i < 5){
            System.out.println("Enter index: ");
            ind = sc.nextInt();
            try{
                System.out.println("Element in array: "+arr1[ind]);
                break;
            }catch (Exception e) {
                if (i == 4) {
                    System.out.println("Error");
                    break;
                } else {
                    System.out.println("Invalid Index! Try again...");
                    i++;
                }
            }
        }
        sc.close();
    }
}
