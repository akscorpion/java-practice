import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short year;
        System.out.println("Enter year: ");
        year = sc.nextShort();
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }
        sc.close();
    }
}
