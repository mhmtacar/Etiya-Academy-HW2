package kodlamaIO.entities.concretes;

import kodlamaIO.core.entities.User;

import java.util.List;

public class Student extends User {

    private List<Course> courses;
    private List<Comment> comments;

    public Student(int id, String firstName, String lastName, String imageUrl, String email) {
        super(id, firstName, lastName, imageUrl, email);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
