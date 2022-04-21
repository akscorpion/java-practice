import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String c;
        int cpu, ch;
        while(true) {
            System.out.printf("\nDo you want to play?(y/n): ");
            c = sc.next();
            if (c.equalsIgnoreCase("y")) {
                System.out.printf("Loading the Game :D...................");
                cpu = rd.nextInt(3);
                System.out.printf("\nPick one:\n0. Rock\n1. Paper\n2. Scissor\n");
                System.out.printf("Enter your choice (0/1/2): ");
                ch = sc.nextInt();
                System.out.printf("\nYou picked: "+(ch>=0 && ch<3?(ch>0?(ch==1?"Paper":"Scissor"):"Rock"):"Invalid Input, Exiting..."));
                if(ch < 0 || ch >= 3) break;
                System.out.printf("\nCPU picked: "+(cpu>0?(cpu==1?"Paper":"Scissor"):"Rock"));
                if (cpu==ch){
                    System.out.printf("\nMatch has tied! Try Again.");
                }else if (cpu == 0 && ch == 2 || cpu == 1 && ch == 0 || cpu == 2 && ch == 1) {
                    System.out.printf("\nSorry, You Lost.");
                }else{
                    System.out.printf("\nCongratulations, You Won!");
                }
            } else if (c.equalsIgnoreCase("n")) {
                System.out.printf("\nThanks for Playing, Goodbye!");
                break;
            } else {
                System.out.printf("\nInvalid input! Exiting..");
                break;
            }
        }
        sc.close();
    }
}
