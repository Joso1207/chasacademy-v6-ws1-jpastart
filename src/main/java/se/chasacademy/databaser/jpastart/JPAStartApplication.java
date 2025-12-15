package se.chasacademy.databaser.jpastart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.chasacademy.databaser.jpastart.repositories.CourseRepository;
import se.chasacademy.databaser.jpastart.repositories.StudentRepository;
import se.chasacademy.databaser.jpastart.repositories.TeacherRepository;

@SpringBootApplication
public class JPAStartApplication implements CommandLineRunner {

    CourseRepository courseRepository;
    StudentRepository studentRepository;
    TeacherRepository teacherRepository;

    JPAStartApplication(
            CourseRepository courseRepository,
            StudentRepository studentRepository,
            TeacherRepository teacherRepository
    ){
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
        this.teacherRepository = teacherRepository;
    }


	public static void main(String[] args) {
		SpringApplication.run(JPAStartApplication.class, args);
	}

	@Override
	public void run(String... args) {

	}
}
