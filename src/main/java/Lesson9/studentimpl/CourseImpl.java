package Lesson9.studentimpl;

import Lesson9.student.Course;

public class CourseImpl implements Course {

    private String courseName;

    public CourseImpl(String courseName){
        this.courseName = courseName;

    }

    @Override
    public String courseName() {
        return courseName;
    }
}
