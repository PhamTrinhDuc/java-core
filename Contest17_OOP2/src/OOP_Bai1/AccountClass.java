package OOP_Bai1;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AccountClass {
    private String maAcc, cusID, username, pass;
    public static ArrayList<AccountClass> listAccount = new ArrayList<>();

    public AccountClass(String maAcc, String cusID, String username, String pass) {
        this.maAcc = maAcc;
        this.cusID = cusID;
        this.username = username;
        this.pass = pass;
        listAccount.add(this);
    }

    public String getUsername() {
        return this.username;
    }

    public String getPass() {
        return this.pass;
    }
}
