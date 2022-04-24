import java.util.Scanner;

public class ProductOfMatrix {
    static void printMatrix(int matrix[][]){
        for (int[] i:matrix){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    static void loadMatrix(int matrix[][], int rows, int cols){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.println("Enter a value: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    static void multiplyMatrix(int[][] m1, int r1, int c1,
                               int[][] m2, int r2, int c2){
        int[][] C = new int[r1][c2];

        for (int i=0; i<r1; i++){
            for (int j=0; j<c2; j++){
                for (int k=0; k<r2; k++){
                    C[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        printMatrix(C);
    }

    public static void main(String[] args) {
        int n = 5, m = 5, k = 5;
        int[][] A = new int[n][m];
        int[][] B = new int[m][k];
        loadMatrix(A,n,m);
        loadMatrix(B,m,k);
        printMatrix(A);
        printMatrix(B);
        multiplyMatrix(A,n,m,B,m,k);
    }
}
