import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> listSorted = new ArrayList<Integer>();
        list.add(1);
        list.add(45);
        list.add(756);
        list.add(11);
        list.add(156);
        list.add(4587);
        TriBulles<Integer> tribulles = new TriBulles(list);
        tribulles.sort(listSorted);
    }
}
