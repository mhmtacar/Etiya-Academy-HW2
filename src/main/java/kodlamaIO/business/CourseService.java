package kodlamaIO.business;

import kodlamaIO.entities.concretes.Course;

import java.util.List;

public interface CourseService {
    void add(Course course) throws Exception;
    void delete(int id) throws Exception;
    List<Course> findAll() throws Exception;
}
