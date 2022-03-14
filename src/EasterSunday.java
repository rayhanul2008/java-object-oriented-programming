import java.util.Scanner;

public class EasterSunday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int y = in.nextInt();
        int a, b, c, d, e, g, h, j, k, r, m, n, p;
        a = y%19;
        b = y/100;
        c = y % 100;
        d = b/4;
        e = b%4;
        g = (8*b + 13)/25;
        h = (19*a + b - d - g + 15)%30;
        j = c/4;
        k = c%4;
        m = (a + 11*h)/319;
        r = (2*e + 2*j - k - h + m + 32)%7;
        n = (h - m + r + 90)/25;
        p = (h - m + r + n + 19)%32;
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("Ester Sunday is "+months[n]+" "+Integer.toString(p));
    }
}
