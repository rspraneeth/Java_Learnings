package com.courses.dao;

import com.courses.main.CourseList;

public class SpringBoot implements CourseList {
    @Override
    public boolean courseChoice(double amount) {
        System.out.println("Springboot course is purchased successfully with amount of "+amount);
        return true;
    }
}
