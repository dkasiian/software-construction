import java.util.Random;
import java.util.Scanner;

public class Main {
    static long A[][] = null;
    static int N = 0;
    static int m = 0;

    public static void main(String[] args){
        System.out.println("Kasiianenko Dmytro");

        System.out.println("Enter length of matrix: ");
        Scanner scanner = new Scanner(System.in);
        N = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter row number: ");
        m = Integer.parseInt(scanner.nextLine()) - 1;

        CreateMatrix();
        PrintMatrix();
        SortMatrix();
        PrintMatrix();
    }

    static void CreateMatrix(){
        A = new long[N][N];
        Random rand = new Random();
        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++)
                A[i][j] = rand.nextLong();
    }

    static void SortMatrix(){
        for (int i = 1; i < N; i++)
            for (int j = i; j > 0; j--)
                if (A[m][j] < A[m][j - 1])
                    SwitchColumn(j);
    }

    static void SwitchColumn(int index){
        for(int row = 0; row < N; row++){
            long temp = A[row][index];
            A[row][index] = A[row][index - 1];
            A[row][index - 1] = temp;
        }
    }

    static void PrintMatrix(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++)
                System.out.format("%30d", A[i][j]);
            System.out.println('\n');
        }
        System.out.println('\n');
    }
}

