import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("MAM");
        name.add("mukul");
        name.add("abu");
        name.add("rayhan");
        name.add("mukul");
        name.add("asheq");
        name.add("abu Rayhan");
        System.out.println("Names Before for duplicates: ");
        for(String str: name){
            System.out.print(str + " ");
        }
        System.out.println();
        int current = 0;
        while (current < name.size()){
            int j = 0;
            boolean isRemoved = false;
            while (j < current){
                if(name.get(current).equals(name.get(j))){
                    name.remove(current);
                    isRemoved = true;
                    break;
                }else j++;
            }
            if(!isRemoved) current++;
        }
        System.out.println("Names after checking for duplicates: ");
        for(String str: name){
            System.out.print(str+ " ");
        }
        System.out.println();

    }
}
