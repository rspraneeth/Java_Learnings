package com.courses.main;

import com.courses.dao.Java;
import com.courses.dao.SQL;
import com.courses.dao.SpringBoot;
import com.courses.service.ProcessCourse;

public class LaunchMain {
    public static void main(String[] args) {
        ProcessCourse pc = new ProcessCourse(new Java());
//        pc.setCourse(new Java());
//        pc.setCourse(new SpringBoot());
        pc.setCourse(new SQL());
        pc.processCourse(100);
    }
}
