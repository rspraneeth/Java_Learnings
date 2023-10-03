package com.courses.dao;

import com.courses.main.CourseList;

public class Java implements CourseList {
    @Override
    public boolean courseChoice(double amount) {
        System.out.println("Java course is purchased successfully with amount of "+amount);
        return true;
    }
}
