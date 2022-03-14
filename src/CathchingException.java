import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CathchingException {
    public static void main(String[] args) {
        try{
            String filename = "hello.txt";
            Scanner in = new Scanner(new File(filename));
            int sum = 0;
            while(in.hasNext()){
                String input = in.next();
                int value = Integer.parseInt(input);
                sum = sum + value;
            }
            System.out.println("Sum: "+sum);
        }catch (IOException exception){
            exception.printStackTrace();
        }catch (NumberFormatException exception){
            System.out.println(exception.getMessage());
        }
    }
}
