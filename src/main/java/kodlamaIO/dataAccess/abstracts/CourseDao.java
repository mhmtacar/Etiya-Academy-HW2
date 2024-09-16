package kodlamaIO.dataAccess.abstracts;

import kodlamaIO.entities.concretes.Course;

import java.util.List;

public interface CourseDao {
	void add(Course course);
	void update(Course course, int id);
	void delete(int id);
	List<Course> findAll();
}
