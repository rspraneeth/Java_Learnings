package com.courses.dao;

import com.courses.main.CourseList;

public class SQL implements CourseList {
    @Override
    public boolean courseChoice(double amount) {
        System.out.println("SQL course is purchased successfully with amount of "+amount);
        return true;
    }
}
