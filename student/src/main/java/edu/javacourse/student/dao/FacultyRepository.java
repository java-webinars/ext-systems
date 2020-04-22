package edu.javacourse.student.dao;

import edu.javacourse.student.domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long>
{
}
