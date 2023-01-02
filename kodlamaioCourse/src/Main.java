import business.CategoryManager;
import business.CoursesManager;
import business.InstructorManager;
import core.DatabaseLogger;
import core.FileLogger;
import core.ILogger;
import dataAccess.HibernateDao;
import entities.Category;
import entities.Courses;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        ILogger[] loggers = {new FileLogger() , new DatabaseLogger()};

        Category category1 = new Category(3,"Game Programming");
        CategoryManager categoryManager = new CategoryManager(loggers , new HibernateDao());
        categoryManager.add(category1);

        Courses courses1 = new Courses(33,"Aranan Programcı Olma Kursu","Örneklerle 100 + saatlik aranan programcı olma kursu","APOK.jpg",139.99);
        CoursesManager coursesManager = new CoursesManager(loggers , new HibernateDao());
        coursesManager.add(courses1);

        Instructor instructor1  = new Instructor(333,"Engin ","Demiroğ");
        InstructorManager instructorManager = new InstructorManager(loggers , new HibernateDao());
        instructorManager.add(instructor1);
    }
}