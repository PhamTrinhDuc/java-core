package OOP_Bai17;

import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> treeSet = new TreeSet<>();

    public WordSet(String s) {
        String[] arr = s.split("\\s+");
        for (String x : arr)
            this.treeSet.add(x);
    }

    public WordSet(TreeSet<String> treeSet) {
        this.treeSet = treeSet;
    }

    public WordSet union(WordSet b) {
        TreeSet<String> res = new TreeSet<>();
        for (String x : this.treeSet) res.add(x);
        for (String x : b.treeSet) res.add(x);
        WordSet ans = new WordSet(res);
        return ans;
    }

    public WordSet intersection(WordSet b) {
        TreeSet<String> res = new TreeSet<>();
        for (String x : this.treeSet) {
            if (b.treeSet.contains(x)) res.add(x);
        }
        WordSet ans = new WordSet(res);
        return ans;
    }

    public String toString() {
        String res = "";
        for (String x : this.treeSet) res += " " + x;
        return res.trim();
    }
}
