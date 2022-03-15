public class ComboLock {
    int secret1, secret2, secret3;
    int[] userSecret = new int[3];
    int passNumber = 0, dial = 0, lastTime = -1;
    public ComboLock(int secret1, int secret2, int secret3){
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        System.out.println("This Secret");
    }
    public void reset(){
        dial = 0;
        passNumber = 0;
    }
    public void turnLeft(int ticks){
        if(lastTime == 0){
            userSecret[passNumber] = dial;
            passNumber++;
        }
        dial += ticks;
        dial %= 40;
        lastTime = 1;
       // System.out.print(dial);
    }
    public void turnRight(int ticks){
        if(lastTime == 1){
            userSecret[passNumber] = dial;
            passNumber++;
        }
        //System.out.println("Right"+dial);
        dial -= ticks;
        System.out.println(dial);
        while(dial < 0) dial += 40;
        lastTime = 0;

    }
    public boolean open(){
        userSecret[passNumber] = dial;
        if(secret1 == userSecret[0] && secret2 == userSecret[1] && secret3 == userSecret[2]){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        ComboLock lock = new ComboLock(5, 10, 15);
        lock.turnLeft(5);
        lock.turnRight(34);
        lock.turnLeft(5);
        if(lock.open()) System.out.println("Unlocked");
        else System.out.println("Wrong Password");
    }
}
