package OOP_Bai1;

public class Person {
    protected String name, ns, add;

    public Person() {
        this.name = "";
        this.ns = "";
        this.add = "";
    }

    public Person(String name, String ns, String add) {
        this.name = name;
        this.ns = ns;
        this.add = add;
    }

    public String transformNS() {
        StringBuilder sb = new StringBuilder(ns);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }

    public String transformName() {
        String res = "";
        this.name = this.name.toLowerCase();
        String[] arr = this.name.trim().split("\\s+");
        for (String x : arr) {
            res += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " ";
        }
        return res.trim();
    }

    public String toString() {
        return this.transformName() + " " + this.transformNS() + " " + this.add;
    }
}
