import com.sun.source.tree.BinaryTree;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class TriTas<T extends Comparable> {

    public List<T> rotateObjects (List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
        return list;
    }


    public void tamiser (ArrayList<T> tree,int node,int n) {
        int k = node;
        int j = k*2;

        while (j <= n){
            if ((j < n) && (tree.get(j).compareTo(tree.get(j+1)) < 0)) {
                ++j;
            }
            if (tree.get(k).compareTo(tree.get(j)) < 0) {
                rotateObjects(tree, k, j);
                k = j;
                j = 2*k;
            } else {
                break;
            }
        }
    }

    public ArrayList<T> triTas (ArrayList<T> tree) {
        for (int i = (tree.size()/2); i >=0; i--) {
            tamiser(tree, i, tree.size()-1);
        }
        for (int j = tree.size()-1; j >=1; j--) {
            rotateObjects(tree, j, 0);
            tamiser(tree, 0, j-1);
        }
        System.out.println(tree);
        return tree;
    }
}
