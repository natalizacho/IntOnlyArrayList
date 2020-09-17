import java.lang.ArrayIndexOutOfBoundsException;

public class Main {

    public static void main(String[] args){


        IntOnlyArrayList il = new IntOnlyArrayList();

        il.add(1);
        il.add(17);
        il.add(42);

        System.out.println(il);
        System.out.println("Size: " + il.size());
        System.out.println("Index : " + il.get(1));


        il.remove(1);


        System.out.println();
        System.out.println("Removed: ");
        System.out.println(il);
        System.out.println("Size: " + il.size());

    }
}
