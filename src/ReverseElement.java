import java.util.Arrays;

public class ReverseElement {
    public static void main(String[] args) {
        double[] data = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        double[] reversed = reverse(data);
        for(int i = 0; i < reversed.length; i++){
            System.out.println(reversed[i]+" ");
        }
        System.out.println();
    }

    public static double[] reverse(double[] data) {
        double[] revData = Arrays.copyOf(data, data.length);
        int j = 0;
        for(int i = data.length-1; i >= 0; i--){
            revData[j] = data[i];
            j++;
        }
        return revData;
    }
}
