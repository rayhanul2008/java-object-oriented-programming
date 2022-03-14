import java.util.Scanner;

public class twoDarry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[2][2];
        System.out.println("Please Input: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print("twoDarray["+i+"]["+j+"] : ");
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Two Dimentional Array Output: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
