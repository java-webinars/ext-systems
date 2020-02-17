package edu.javacourse.student.service;

import edu.javacourse.student.dao.UniversityRepository;
import edu.javacourse.student.domain.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UniversityService
{
    @Autowired
    private UniversityRepository universityRepository;

    @Transactional(readOnly = true)
    public List<University> findUniversities() {
        return universityRepository.findAll();
    }
}
