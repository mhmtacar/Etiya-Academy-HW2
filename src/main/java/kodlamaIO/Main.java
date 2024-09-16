package kodlamaIO;

import kodlamaIO.business.CourseManager;
import kodlamaIO.business.CourseService;
import kodlamaIO.core.logging.abstracts.Logger;
import kodlamaIO.core.logging.concretes.ConsoleLogger;
import kodlamaIO.dataAccess.concretes.InMemoryCourseDao;
import kodlamaIO.entities.concretes.Course;

public class Main {

    public static void getAllCourses(CourseService courseService) throws Exception {
        for (Course course : courseService.findAll()){
            System.out.println("Kurs ismi : " + course.getName());

        }
        System.out.println("-----------");
    }

    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new ConsoleLogger()};

        CourseService courseService = new CourseManager(new InMemoryCourseDao(), loggers);
        getAllCourses(courseService);

        Course course = new Course(3,"2024 Yazılım Geliştirici Yetiştirme Kampı (C#)",0,"deneme3.png",1,1);
        courseService.add(course);
        getAllCourses(courseService);

        courseService.delete(course.getId());
        getAllCourses(courseService);
//        

    }


}
