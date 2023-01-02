package business;

import core.ILogger;
import dataAccess.IInstructorDao;
import entities.Instructor;

public class InstructorManager {
    private ILogger[] loggers;
    private IInstructorDao instructorDao;

    public InstructorManager(ILogger[] loggers, IInstructorDao instructorDao) {
        this.loggers = loggers;
        this.instructorDao = instructorDao;
    }

    public void add(Instructor instructor){
        Instructor[] instructors = {
                new Instructor(111,"Engin","Demiroğ"),
                new Instructor(222,"Mustafa Murat","Coşkun"),
        };

        instructorDao.add(instructor);

        for (ILogger logger:loggers){
            logger.log("Save Instructor");
        }
    }
}
