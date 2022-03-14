public class loop {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 20;
        b = calculateNumber(a, b);
        prln(calculateNumber(a, b));
        pr(a);

    }
    static int calculateNumber(int number1, int number2){
        number1 += number2;
        return number1;
    }
    static void prln(Object anyObject){
        System.out.println(anyObject);
    }
    static void pr(Object anyObject){
        System.out.println(anyObject);
    }
}
