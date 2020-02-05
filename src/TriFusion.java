import java.util.ArrayList;
import java.util.List;

public class TriFusion<T extends Comparable> {
    private List<T> listToSort;

    public TriFusion(List<T> listToSort) {
        this.listToSort = listToSort;
    }

    public List<T> triFusion (List<T> list) {
        if (list.size() <= 1)
            return list;
        else {
            List<T> e1 = new ArrayList<>();
            List<T> e2 = new ArrayList<>();
            for (int i = 0; i < (list.size())/2; ++i) {
                e1.add(list.get(i));
            }
            for (int j = (list.size())/2; j < list.size(); ++j) {
                e2.add(list.get(j));
            }
            return fusion(triFusion(e1), triFusion(e2));
        }
    }

    public List<T> fusion (List<T> e1, List<T> e2) {
        List<T> listSorted = new ArrayList<>();
        System.out.println("e1 = " + e1);
        System.out.println("e2 = " + e2);
        if (e1.isEmpty()) return e2;
        if (e2.isEmpty()) return e1;
        int cpte1 = 0;
        int cpte2 = 0;
        int cpt = 0;
        for (; cpte1 < e1.size() && cpte2 < e2.size(); ++cpt) {
            if (e1.get(cpte1).compareTo(e2.get(cpte2)) < 0) {
                listSorted.add(e1.get(cpte1));
                cpte1 += 1;
            } else {
                listSorted.add(e2.get(cpte2));
                cpte2 += 1;
            }
            for( ; cpte1 < e1.size(); ++cpt, ++cpte1 ) {
                listSorted.add(e1.get(cpte1));
            }
            for( ; cpte2 < e2.size(); ++cpt, ++cpte2 )  {
                listSorted.add(e2.get(cpte2));
            }
        }
        System.out.println("the list actually : " + listSorted);
        return listSorted;
    }

}
