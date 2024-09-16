package kodlamaIO.dataAccess.concretes;

import kodlamaIO.dataAccess.abstracts.CourseDao;
import kodlamaIO.entities.concretes.Course;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCourseDao implements CourseDao {

    List<Course> courses;

    public InMemoryCourseDao() {
        courses = new ArrayList<Course>();
        courses.add(new Course(1,"(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA",0,"deneme.png",1,1));
        courses.add(new Course(2,"(2023) Yazılım Geliştirici Yetiştirme Kampı - Python & Selenium",0,"deneme2.png",2,1));
    }

    @Override
    public void add(Course course) {
        courses.add(course);
    }

    @Override
    public void update(Course course, int id) {
        courses.set(id,course);
    }

    @Override
    public void delete(int id) {
        courses.remove(id);
    }

    @Override
    public List<Course> findAll() {
        return courses;
    }
}
