package dataAccess;

import entities.Category;
import entities.Courses;
import entities.Instructor;

public class JdbcDao implements ICategoryDao , ICoursesDao , IInstructorDao{

    @Override
    public void add(Category category) {
        System.out.println("Category : " + category.getName());
    }

    @Override
    public void add(Courses courses) {
        System.out.println("Course : " + courses.getName());
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor : " + instructor.getFirstName() + "" + instructor.getLastName());
    }
}
