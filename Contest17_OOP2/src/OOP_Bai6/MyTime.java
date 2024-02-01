package OOP_Bai6;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MyTime {

    private int hour, minute, second;

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public void getNextHour() {
        this.hour = (this.hour + 1) % 24;
    }

    public void getNextSecond() {
        this.second = this.second + 1;
        if (this.second == 60) {
            this.second = 0;
            getNextMinute();
        }
    }

    public void getNextMinute() {
        this.minute = this.minute + 1;
        if (this.minute == 60) {
            this.minute = 0;
            getNextHour();
        }
    }

    public void getAfterHour() {
        this.hour = (this.hour - 1 + 24) % 24;
    }

    public void getAfterMinute() {
        this.minute = this.minute - 1;
        if (this.minute == -1) {
            this.minute = 59;
            getAfterHour();
        }
    }

    public void getAfterSecond() {
        this.second = this.second - 1;
        if (this.second == -1) {
            this.second = 59;
            getAfterMinute();
        }
    }

    public String toString() {
        return String.format("%02d", this.hour) + ":" + String.format("%02d", this.minute) + ":" + String.format("%02d", this.second);
    }
}
