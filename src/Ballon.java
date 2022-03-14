import java.util.Scanner;

public class Ballon {
    double radius = 0.0;
    public void inflate (double amount){
        radius += amount;
    }
    public double getVolume(){
        double result =( 4/3) * Math.PI * radius*radius*radius;
        return result;
    }
    public static void main(String[] args) {
        Ballon ans = new Ballon();
        ans.inflate(50);
        System.out.println(ans.getVolume());
    }
}
