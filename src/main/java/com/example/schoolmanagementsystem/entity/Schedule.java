package com.example.schoolmanagementsystem.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
public class Schedule {
    @TableId
    private Integer id;
    private String schtitle;
    private String schdesc;
    private Time timestart;
    private Time timeend;
    private String day;

    public Schedule() {
    }

    public Schedule(String schtitle, String schdesc, Time timestart, Time timeend, String day) {
        this.schtitle = schtitle;
        this.schdesc = schdesc;
        this.timestart = timestart;
        this.timeend = timeend;
        this.day = day;
    }

    public Schedule(Integer id, String schtitle, String schdesc, Time timestart, Time timeend, String day) {
        this.id = id;
        this.schtitle = schtitle;
        this.schdesc = schdesc;
        this.timestart = timestart;
        this.timeend = timeend;
        this.day = day;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchtitle() {
        return schtitle;
    }

    public void setSchtitle(String schtitle) {
        this.schtitle = schtitle;
    }

    public String getSchdesc() {
        return schdesc;
    }

    public void setSchdesc(String schdesc) {
        this.schdesc = schdesc;
    }

    public Time getTimestart() {
        return timestart;
    }

    public void setTimestart(Time timestart) {
        this.timestart = timestart;
    }

    public Time getTimeend() {
        return timeend;
    }

    public void setTimeend(Time timeend) {
        this.timeend = timeend;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
