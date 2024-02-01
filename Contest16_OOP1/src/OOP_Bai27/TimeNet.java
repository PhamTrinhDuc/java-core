package OOP_Bai27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TimeNet {
    private String username, password, tenNguoiChoi, timeIn, timeOut;
    private int time;
    public static ArrayList<TimeNet> listTime = new ArrayList<>();

    public TimeNet(String username, String password, String tenNguoiChoi, String timeIn, String timeOut) {
        this.username = username;
        this.password = password;
        this.tenNguoiChoi = tenNguoiChoi;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        listTime.add(this);
        int timein = Integer.parseInt(this.timeIn.substring(0, 2)) * 60 + Integer.parseInt(this.timeIn.substring(3));
        int timeout = Integer.parseInt(this.timeOut.substring(0, 2)) * 60 + Integer.parseInt(this.timeOut.substring(3));
        this.time = timeout - timein;
    }

    private String convert() {
        int h = this.time / 60;
        int p = this.time % 60;
        return h + " gio " + p + " phut ";
    }

    public static void sapDanhSach() {
        Collections.sort(listTime, new Comparator<TimeNet>() {
            @Override
            public int compare(TimeNet o1, TimeNet o2) {
                if (o1.time != o2.time)
                    return o2.time - o1.time;
                return o1.username.compareTo(o2.username);
            }
        });
    }

    public String toString() {
        return this.username + " " + this.password + " " + this.tenNguoiChoi + " " + this.convert();
    }

    public static void inDanhSach() {
        for (TimeNet x : listTime)
            System.out.println(x);
    }


}
