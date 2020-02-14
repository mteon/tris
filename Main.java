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
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(45);
        list2.add(756);
        list2.add(11);
        list2.add(156);
        list2.add(4587);
        System.out.println(list2);
        //TriBulles<Integer> tribulles = new TriBulles(list);
        //tribulles.sort(listSorted);
        //TriFusion<Integer> triFusion = new TriFusion<>(list);
        //triFusion.triFusion(list);
        //TriRapide<Integer> quicksort = new TriRapide<>(list);
        //quicksort.quicksort(list, 0, list.size()-1);
        TriTas<Integer> triTas = new TriTas();
        System.out.println(triTas.triTas(list2));
    }
}
