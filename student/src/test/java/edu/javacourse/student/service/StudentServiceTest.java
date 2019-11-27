package edu.javacourse.student.service;

import edu.javacourse.student.rest.StudentController;
import edu.javacourse.student.view.StudentRequest;
import edu.javacourse.student.view.StudentResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class StudentServiceTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceTest.class);

    @Autowired
    private StudentController studentController;

    @Test
    public void studentInfo() {
        StudentRequest req = new StudentRequest();
        req.setLastName("Last");
        req.setFirstName("First");
        req.setMiddleName("Middle");
        req.setDateOfBirth(LocalDate.of(2000, 4, 12));
        req.setPassportSeria("1111");
        req.setPassportNumber("222222");
        req.setPassportDate(LocalDate.of(2016, 4, 30));

        List<StudentResponse> info = studentController.getStudentInfo(req);
        Assert.assertTrue(info.size() > 0);
    }
}