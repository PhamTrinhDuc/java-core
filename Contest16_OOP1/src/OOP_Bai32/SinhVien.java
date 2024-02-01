package OOP_Bai32;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SinhVien {
    private String ma, name, lop, mail;

    public SinhVien(String ma, String name, String lop, String mail) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
    }

    private String transformName() {
        String res = "";
        name = name.toLowerCase();
        String[] arr = name.trim().split("\\s+");
        for (String x : arr) {
            res += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " ";
        }
        return res.trim();
    }

    public String getKhoa() {
        return this.ma.substring(0, 4);
    }

    public String toString() {
        return this.ma + " " + transformName() + " " + this.lop + " " + this.mail;
    }
}

