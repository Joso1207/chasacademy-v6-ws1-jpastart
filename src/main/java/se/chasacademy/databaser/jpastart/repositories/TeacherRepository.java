package se.chasacademy.databaser.jpastart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se.chasacademy.databaser.jpastart.models.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
