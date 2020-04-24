package edu.javacourse.student.service;

import edu.javacourse.student.dao.FacultyRepository;
import edu.javacourse.student.dao.UniversityRepository;
import edu.javacourse.student.domain.Faculty;
import edu.javacourse.student.domain.University;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityService
{
    @Autowired
    private UniversityRepository universityRepository;
    @Autowired
    private FacultyRepository facultyRepository;

    @Transactional(readOnly = true)
    public List<University> findUniversities() {
        return universityRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<University> findFullUniversities() {
        return universityRepository.findFullList();
    }

    @Transactional(readOnly = true)
    public List<Faculty> findFaculties() {
        return facultyRepository.findAll();
    }

    @Transactional
    public University getUniversity(Long universityId) {
        University u = universityRepository.findById(universityId).get();
        Hibernate.initialize(u.getFaculties());
        return u;
    }

    @Transactional(readOnly = true)
    public Faculty getFaculty(Long facultyId) {
        Optional<Faculty> fop = facultyRepository.findById(facultyId);
        Faculty fc = fop.get();
        Hibernate.initialize(fc.getUniversity());
        return fc;
    }
}
