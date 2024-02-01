package OOP_Bai16;

import java.util.TreeSet;

class Union {
    private TreeSet<Integer> treeSet = new TreeSet<>();

    public Union() {
    }

    public Union(int[] a) {
        for (int i = 0; i < a.length; i++) {
            treeSet.add(a[i]);
        }
    }

    public Union(TreeSet<Integer> treeSet) {
        this.treeSet = treeSet;
    }

    public Union union(Union b) {
        TreeSet<Integer> res = new TreeSet<>();
        for (int x : this.treeSet) {
            res.add(x);
        }
        for (int x : b.treeSet) {
            res.add(x);
        }
        Union ans = new Union(res);
        return ans;
    }

    public String toString() {
        String s = "";
        for (int x : treeSet) {
            s += " " + x;
        }
        return s.trim();
    }
}