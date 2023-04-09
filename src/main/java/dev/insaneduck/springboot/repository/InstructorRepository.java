package dev.insaneduck.springboot.repository;

import dev.insaneduck.springboot.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor,Integer>
{
}
