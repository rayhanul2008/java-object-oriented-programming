public class Random {
    public static int[] generateRandom(int n){
        int[] tosses = new int[n];
        for(int i = 0; i < n; i++){
            tosses[i] = (int)(Math.random()*100);
        }
        return tosses;
    }
    public static void printArray(int[] value){
        for(int i = 0; i < value.length; i++){
            System.out.println(value[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] value = generateRandom(20);
        printArray(value);
        printArray(value);
    }
}
