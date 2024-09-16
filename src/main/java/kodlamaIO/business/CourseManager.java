package kodlamaIO.business;

import java.util.List;

import kodlamaIO.core.logging.abstracts.Logger;
import kodlamaIO.dataAccess.abstracts.CourseDao;
import kodlamaIO.entities.concretes.Course;

public class CourseManager implements CourseService {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {

		for(Course c : courseDao.findAll()) {
			if(c.getName().equalsIgnoreCase(course.getName())) {
				throw new Exception("Kurs ismi tekrar edemez");
			}
		}
		if(course.getPrice()<0) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz");
		}

		courseDao.add(course);

		for(Logger logger : loggers) {
			logger.log(course.getName() + " kursu eklendi");
		}
	}

	public List<Course> findAll() throws Exception {
		return courseDao.findAll();
	}

	public void delete(int id) throws Exception {
		for(Course c : courseDao.findAll()) {
			if(c.getId() == id) {
				courseDao.delete(id-1);
				for(Logger logger : loggers) {
					logger.log(c.getName() + " kursu silindi");
				}
				return;
			}
		}
		throw new Exception("Kurs silme için yanlış id değeri");
	}

}
