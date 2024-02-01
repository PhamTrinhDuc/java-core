package OOP_Bai1;
class PhanSo {
    private long a, b;

    PhanSo(long a, long b) {
        this.a = a;
        this.b = b;
    }

    public void solve() {
        long tmp1 = a, tmp2 = b;
        while (tmp2 != 0) {
            long tmp = tmp1 % tmp2;
            tmp1 = tmp2;
            tmp2 = tmp;
        }
        a /= tmp1;
        b /= tmp1;
    }

    public String toString() {
        return a + "/" + b;
    }
}
