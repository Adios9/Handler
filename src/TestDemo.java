import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: Adiós.
 * @Date: 2020/5/21 16:25
 */
public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List<String> stringList = list1.stream().map(String::valueOf).collect(Collectors.toList());
        for (int i=0; i<stringList.size(); i++){
            System.out.println(stringList.get(i));
        }

        ArrayList<String> list2 = new ArrayList<>();
        /*list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
        list2.add("6");*/

        list2.removeAll(list1);
    }
}
