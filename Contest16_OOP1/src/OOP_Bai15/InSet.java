package OOP_Bai15;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InSet {
    private TreeSet<Integer> treeSet = new TreeSet<>();

    public InSet() {
    }

    public InSet(int[] a) {
        for (int i = 0; i < a.length; i++) {
            this.treeSet.add(a[i]);
        }
    }

    public InSet(TreeSet<Integer> treeSet) {
        this.treeSet = treeSet;
    }

    public InSet intersection(InSet b) {
        TreeSet<Integer> res = new TreeSet<>();
        for (int x : this.treeSet) {
            if (b.treeSet.contains(x))
                res.add(x);
        }
        InSet inSet = new InSet(res);
        return inSet;
    }

    public String toString() {
        String res = "";
        for (int x : treeSet) {
            res += x + " ";
        }
        return res.trim();
    }
}
