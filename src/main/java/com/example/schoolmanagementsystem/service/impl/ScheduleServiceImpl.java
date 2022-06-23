package com.example.schoolmanagementsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schoolmanagementsystem.dao.ScheduleDao;
import com.example.schoolmanagementsystem.entity.Schedule;
import com.example.schoolmanagementsystem.service.ScheduleService;
import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpl extends ServiceImpl<ScheduleDao, Schedule> implements ScheduleService {
}
