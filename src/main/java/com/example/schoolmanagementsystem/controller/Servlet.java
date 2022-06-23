package com.example.schoolmanagementsystem.controller;

import com.example.schoolmanagementsystem.entity.Schedule;
import com.example.schoolmanagementsystem.service.ScheduleService;
import com.example.schoolmanagementsystem.service.impl.ScheduleServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Time;

@WebServlet(name = "Servlet", value = "/add_schedule")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String schtitle = request.getParameter("schtitle");
        String schdesc = request.getParameter("schdesc");
        String start = request.getParameter("timestart");
        String end = request.getParameter("timeend");
        Time timestart = Time.valueOf(start);
        Time timeend = Time.valueOf(end);
        String day = request.getParameter("day");

        Schedule sch = new Schedule(schtitle,schdesc,timestart,timeend,day);

        ScheduleService schService = new ScheduleServiceImpl();

        schService.save(sch);

    }
}
