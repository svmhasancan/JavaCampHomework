package business;

import core.ILogger;
import dataAccess.ICoursesDao;
import entities.Courses;

public class CoursesManager {
    private ILogger[] loggers;
    private ICoursesDao coursesDao;

    public CoursesManager(ILogger[] loggers, ICoursesDao coursesDao) {
        this.loggers = loggers;
        this.coursesDao = coursesDao;
    }

    public void add(Courses courses) throws Exception {
        Courses[] course = {
                new Courses(11,"Java Kursu(2022)","Sıfırdan Sektörün Yükseklerine Java Kursu","JAVA.img",99.99),
                new Courses(22,"C# Kursu(2019)","Sıfırdan Sektörün Yükseklerine C# Kursu","C#.img",119.99)
        };
        for (Courses courses1:course){
            if(courses.getName() == courses1.getName()){
                throw new Exception("Bu Kurs Zaten Mevcut!");
            } else if (courses.getPrice()<0){
                throw new Exception("Kurs Fiyatı 0'dan Küçük Olamaz!");
            }
        }

        coursesDao.add(courses);

        for (ILogger logger:loggers){
            logger.log("Save Course");
        }
    }
}
