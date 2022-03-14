import java.util.Random;

public class element {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int i, sum = 0, sumeven = 0, sumodd = 0;
        for(i = 0; i < 10; i++){
            Random r = new Random();
            arr[i] = r.nextInt(100);
        }
        System.out.println("All Elements are : ");
        for(i = 0; i < 10; i++){
            System.out.println("At index "+i+": "+arr[i]);
        }
        /*System.out.println("Elements at even index are : ");
        for(i = 0; i < 10; i+=2){
            System.out.println("At index "+i+": "+arr[i]);
        }*/
        /*System.out.println("Elements in reverse order : ");
        for(i = 9; i >= 0; i--){
            System.out.println("At index"+i+": "+arr[i]);
        }*/
        System.out.println("First element: "+arr[0]+" Last element: "+arr[9]);
        int min = arr[0];
        int max = arr[0];
        sum += arr[0];
        for(i = 1; i < 10; i++){
            sum += arr[i];
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum element: "+max+" Minimum Elemne: "+min);
        System.out.println("Sum All element: "+sum);
    }
}
