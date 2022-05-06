import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> myAL = new ArrayList<>();
        for (int i=0; i<5; i++){
            myAL.add(sc.nextInt());
        }
        myAL.remove(1);
        for (Integer value : myAL) {
            System.out.print(value + ", ");
        }
        ArrayList<Integer> myAL2 = new ArrayList<>();
        myAL2.add(5);
        myAL2.add(0,3);
        myAL2.add(6);
        myAL2.addAll(1, myAL);
        myAL2.removeAll(myAL);
        for (Integer integer : myAL2) {
            System.out.print(integer+", ");
        }
        System.out.println(myAL.contains(11));
        myAL2.set(0,999);
        System.out.println(myAL2.get(0));
        System.out.println(myAL.indexOf(33));
        System.out.println(myAL2.lastIndexOf(6));
    }
}
