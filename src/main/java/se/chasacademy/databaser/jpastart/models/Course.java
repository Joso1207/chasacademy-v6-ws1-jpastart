package se.chasacademy.databaser.jpastart.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false, unique = true, length = 5)
    private String courseCode;
    @ManyToOne
    private Teacher teacher;
    @ManyToMany
    private Set<Student> Students = new HashSet<>();

    public Course() {
    }

    public Course(long id, String title, String courseCode, Teacher teacher) {
        this.id = id;
        this.title = title;
        this.courseCode = courseCode;
        this.teacher = teacher;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
