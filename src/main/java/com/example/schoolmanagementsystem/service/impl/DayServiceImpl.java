package com.example.schoolmanagementsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schoolmanagementsystem.dao.DayDao;
import com.example.schoolmanagementsystem.entity.Day;
import com.example.schoolmanagementsystem.service.DayService;
import org.springframework.stereotype.Service;

@Service
public class DayServiceImpl extends ServiceImpl<DayDao, Day> implements DayService {
}
