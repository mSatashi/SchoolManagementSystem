package com.example.schoolmanagementsystem.controller;

import com.example.schoolmanagementsystem.entity.Day;
import com.example.schoolmanagementsystem.entity.Schedule;
import com.example.schoolmanagementsystem.service.DayService;
import com.example.schoolmanagementsystem.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ScheduleController {
    @Autowired
    ScheduleService schedule;

    @Autowired
    DayService dayService;

    @RequestMapping("schedule/list")
    String getAllSchedule(HttpSession session){
        List<Schedule> schedules = schedule.list();
        List<Day> days = dayService.list();
        session.setAttribute("listschedules", schedules);
        session.setAttribute("listdays",days);
        return "schedulesview/schedule";
    }

    @RequestMapping("schedule/edit")
    String edit(int id, HttpSession session){
        Schedule sch = schedule.getById(id);
        session.setAttribute("editschedule", sch);
        return "schedulesview/edit";
    }
    @RequestMapping("schedule/update")
    String update(Schedule sch){
        schedule.updateById(sch);
        return "redirect:/schedule/list";
    }

    @RequestMapping("schedule/add")
    String addSchedule(Schedule sch){
        schedule.save(sch);
        return "redirect:/schedule/list";
    }
}
