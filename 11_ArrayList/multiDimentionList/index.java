import java.util.ArrayList;
public class index { 
    public static void main(String[] args) {
    ArrayList <ArrayList <Integer>> mainList = new ArrayList<>();
    ArrayList <Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    mainList.add(list);
    ArrayList <Integer> list2 = new ArrayList<>();
    list2.add(2);
    list2.add(4);
    list2.add(6);
    list2.add(8);
    list2.add(10);
    mainList.add(list2);
    ArrayList <Integer> list3 = new ArrayList<>();
    list3.add(3);
    list3.add(6);
    list3.add(9);
    list3.add(12);
    list3.add(15);
    mainList.add(list3);

for (int index = 0; index < mainList.size(); index++) {
    ArrayList <Integer>  curr = mainList.get(index);
    for (int j = 0; j < curr.size(); j++) {
        System.out.print(curr.get(j) + " ");
    }
    System.out.println();
    
}
System.out.println(mainList);
}
    
}