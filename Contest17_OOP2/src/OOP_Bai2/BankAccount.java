package OOP_Bai2;

import OOP_Bai8.Account;

import javax.swing.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BankAccount {
    private String ID, customerID, soTaiKhoan, pinCode;
    private int soDuTk;
    private int MIN_BALANCE = 50;
    public static ArrayList<BankAccount> listAccount = new ArrayList<>();

    public BankAccount() {
    }

    public BankAccount(String ID, String customerID, String soTaiKhoan, String pinCode, int soDuTk) {
        this.ID = ID;
        this.customerID = customerID;
        this.soTaiKhoan = soTaiKhoan;
        this.pinCode = pinCode;
        this.soDuTk = soDuTk;
        listAccount.add(this);
    }

    public static BankAccount findAcc(String soTaiKhoan) {
        for (BankAccount x : listAccount) {
            if (x.soTaiKhoan.equals(soTaiKhoan)) {
                return x;
            }
        }
        return null;
    }

    public boolean canUpdateOrNot(int money) {
        return this.soDuTk >= money + MIN_BALANCE;
    }

    public void updateBalence(int money) {
        this.soDuTk += money;
    }

    public static void transfer(String X, String Y, int z) {
        BankAccount fromAcc = findAcc(X);
        BankAccount toAcc = findAcc(Y);
        if (fromAcc.canUpdateOrNot(z)) {
            fromAcc.updateBalence(-z);
            toAcc.updateBalence(z);
        }
    }

    public static void deposit(String X, int z) {
        BankAccount acc = findAcc(X);
        acc.updateBalence(z);
    }

    public static void withdraw(String X, int z) {
        BankAccount acc = findAcc(X);
        if (acc.canUpdateOrNot(z)) {
            acc.updateBalence(-z);
        }
    }

    public String toString() {
        return "ID : " + this.ID + "\n" + "CusID : " + this.customerID + "\n"
                + "Number : " + this.soTaiKhoan + "\n" + "PIN : " + this.pinCode + "\n"
                + "Balance : " + this.soDuTk + "VND\n" + "-------------------";
    }
}
