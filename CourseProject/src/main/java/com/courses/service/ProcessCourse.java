package com.courses.service;

import com.courses.main.CourseList;

public class ProcessCourse {

    private CourseList course;

    public void setCourse(CourseList course) {
        this.course = course;
    }

    public ProcessCourse(CourseList course) {
        this.course = course;
    }

    public boolean processCourse(double amount){
        boolean status = course.courseChoice(amount);
        if (status) System.out.println("processed successfully");
        else System.out.println("Didnt process");
        return true;
    }
}
