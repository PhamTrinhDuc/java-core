package OOP_Bai3;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Help {
    private String power, blood, status;
    private int sucManh, Mau;

    public Help(String power, String blood, String status) {
        this.power = power;
        this.blood = blood;
        this.status = status;
        this.sucManh = Integer.parseInt(this.power.substring(8));
        this.Mau = Integer.parseInt(this.blood.substring(8));
    }

    public void Combat(Scanner sc) {
        System.out.println(this.status + " " + this.sucManh + " " + this.Mau);
        if (this.status.equals("DEAD")) return;
        String mode = sc.next();
        if (mode.equals("witch")) {
            int x = sc.nextInt();
            if (this.sucManh <= x) {
                this.sucManh = 0;
                this.Mau = 0;
                this.status = "DEAD";
                return;
            } else this.sucManh += 5;
        } else if (mode.equals("mushroom")) {
            this.Mau -= 15;
            this.sucManh -= 2;
            if (this.Mau <= 0 || this.sucManh <= 0) {
                this.sucManh = 0;
                this.Mau = 0;
                this.status = "DEAD";
                return;
            }
        } else if (mode.equals("pea")) {
            this.Mau += 10;
            this.sucManh += 2;
        } else {
            int x = sc.nextInt();
            if (this.sucManh <= x) {
                this.sucManh = 0;
                this.Mau = 0;
                this.status = "DEAD";
                return;
            }
            this.sucManh += 7;
            this.Mau += 5;
        }
    }

    public String toString() {
        return "POWER : " + this.sucManh + "\n" + "BLOOD : " + this.Mau + "\n"
                + status + "\n" + "--------------------";
    }
}
