package dev.insaneduck.springboot.repository;

import dev.insaneduck.springboot.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer>
{
}
