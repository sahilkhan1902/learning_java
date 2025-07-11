import java.util.ArrayList;
public class index { public static void main(String[] args) {
    
    ArrayList <Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
 

    // reverse array List 0(n)
    for (int index = list.size()-1; index >=0; index--) {
        System.out.println(list.get(index)+ " ");
        
    }
    int max = Integer.MIN_VALUE; // 0(N)
    for (int index = 0; index < list.size(); index++) {
        // if(max < list.get(index)){
        //     max = list.get(index);
        // }
        max = Math.max(max, list.get(index));
    }
    System.out.println(max + " is the max number");


}
    
}
