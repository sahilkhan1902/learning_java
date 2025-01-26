import java.util.ArrayList;

public class index {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        // ArrayList <Boolean> list = new ArrayList<>();
        // ArrayList <String> list = new ArrayList<>();
        list.add(1); // O(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // get operation O(1);
        System.out.println(list.get(2));
        
        // remove operation 
        list.remove(2);
        System.out.println(list);

        // set operation 
        list.set(2, 9);
        System.out.println(list);

          // Contains operation 
          System.out.println( list.contains(2));
          System.out.println( list.contains(11));

    }
}
