import java.util.Scanner;

public class sumWithoutSmallest {
    public static double sumWithoutSmallest1(double[] arr, int size){
        double total = 0;
        double min = arr[0];
        for(int i = 0; i < size; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            total += arr[i];
        }
        return total - min;
    }
    public static void main(String[] args) {
        double[] arr = new double[10];
        int size = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Elements: ");
        while(in.hasNextDouble() && size < arr.length){
            arr[size] = in.nextDouble();
            size++;
        }
        Double total = sumWithoutSmallest1(arr, size);
        System.out.println("Final Total Sum: "+total);
    }
}
