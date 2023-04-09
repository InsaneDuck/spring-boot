package dev.insaneduck.springboot.repository;

import dev.insaneduck.springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
}
