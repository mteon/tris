import java.util.ArrayList;
import java.util.List;

public class TriBulles <T extends Comparable> {
    private List<T> listToSort;
    private T tempT;

    public TriBulles(List<T> listToSort) {
        this.listToSort = listToSort;
        this.tempT = null;
    }

    public List<T> rotateObjects (List<T> list, int i, int j) {
        this.tempT = list.get(i);
        list.set(i, list.get(j));
        list.set(j, this.tempT);
        return list;
    }

    public List<T> sort (List<T> listSorted) {
        listSorted = this.listToSort;
        System.out.println(listSorted);
        for(int i = 0; i < listSorted.size(); ++i) {
            for(int j = 1; j < i-1; ++j) {
                if (listSorted.get(j).compareTo(listSorted.get(j+1)) == 1) {
                    rotateObjects(listSorted, j, j+1);
                }
            }
        }
        System.out.println(listSorted);
        return listSorted;
    }
    
}
