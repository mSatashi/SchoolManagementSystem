package com.example.schoolmanagementsystem.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import org.springframework.stereotype.Component;

@Component
public class Day {
    @TableId
    private int dayno;
    private String dayid;
    private String dayname;

    public Day() {
    }

    public Day(String dayid, String dayname) {
        this.dayid = dayid;
        this.dayname = dayname;
    }

    public Day(int dayno, String dayid, String dayname) {
        this.dayno = dayno;
        this.dayid = dayid;
        this.dayname = dayname;
    }

    public int getDayno() {
        return dayno;
    }

    public void setDayno(int dayno) {
        this.dayno = dayno;
    }

    public String getDayid() {
        return dayid;
    }

    public void setDayid(String dayid) {
        this.dayid = dayid;
    }

    public String getDayname() {
        return dayname;
    }

    public void setDayname(String dayname) {
        this.dayname = dayname;
    }

    @Override
    public String toString() {
        return "Day{" +
                "dayno=" + dayno +
                ", dayid='" + dayid + '\'' +
                ", dayname='" + dayname + '\'' +
                '}';
    }
}
