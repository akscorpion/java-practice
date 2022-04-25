public class ArrayReverse {
    static void reverseArray(int[] arr){
        for (int i=0; i<arr.length/2; i++){
            arr[i] += arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i] - arr[arr.length - i - 1];
            arr[i] -= arr[arr.length - i - 1];
        }
        printArray(arr);
    }

    static void printArray(int[] arr){
        for (int i:arr){
            System.out.printf(i+", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8};
        printArray(A);
        reverseArray(A);
    }
}
