package kodlamaIO.entities.concretes;

import kodlamaIO.core.entities.User;

import java.util.List;

public class Instructor extends User {
    private String description;
    private List<Course> courses;

    public Instructor(int id, String firstName, String lastName, String imageUrl, String email, String description) {
        super(id,firstName,lastName,imageUrl,email);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
