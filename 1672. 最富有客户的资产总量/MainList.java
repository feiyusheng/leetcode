import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainList {
    public static void main(String[] args) {
        List<Integer> str = new ArrayList<>();
        str.add(1);
        str.add(2);
        str.add(3);
        str.add(4);
        str.add(5);
        str.add(6);
        str.add(7);
        str.add(8);
        str.add(9);
//        str.add(10);
//        str.add(11);
//        str.add(5);
        int pageNum = 2;
        int pageSize = 5;
        System.out.println(str.stream().skip(pageSize * pageNum).limit(pageSize).collect(Collectors.toList()));
    }
}
