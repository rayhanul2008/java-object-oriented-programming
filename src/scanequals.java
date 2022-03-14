import java.util.Locale;
import java.util.Scanner;
public class scanequals {
    static Scanner myScanner = new Scanner(System.in);
    static String[] s = {"hello", "java", "C"};
    public static void main(String[] args) {
        String inp = myScanner.nextLine();
        if(s[0].toLowerCase(Locale.ROOT).equals(inp.toLowerCase(Locale.ROOT))){
            System.out.println("You option "+s[0]);
        }else if(s[1].toLowerCase(Locale.ROOT).equals(inp.toLowerCase(Locale.ROOT))){
            System.out.println("You option "+s[1]);
        }else{
            System.out.println("Sorry");
        }


    }
}
