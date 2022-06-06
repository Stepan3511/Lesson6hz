package DZ9;

import DZ9.Course.Course;

public class CourseClass implements Course {

    String title;

    public CourseClass(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
