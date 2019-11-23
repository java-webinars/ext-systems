package edu.javacourse.student.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentService.class);

    public void simpleCall() {
        LOGGER.info("CALLED !!!");
    }
}
