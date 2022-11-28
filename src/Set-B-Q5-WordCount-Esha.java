import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class mythread3 implements Runnable{
    String filename;

    mythread3(String a) {
        filename = a;
    }
    @Override
    public void run() {
        Scanner in = null;
        try {
            in = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int Wcount = 0;
        String word;
        while (in.hasNext()) {
            word = in.next();
            Wcount++;

        }
        System.out.println(filename + ":" +Wcount);
    }
}
public class wordCount {
    public static void main(String[] args) {
        for(int i = 0;i< args.length;i++)
        {
            mythread3 m = new mythread3(args[i]);
            Thread my = new Thread(m);
            my.start();
        }
    }
}
