package com.rima.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentService {

    public List<Student> findAllStudents() {


        return List.of(
                new Student(
                        "Rima",
                        "Jha",
                        23,
                        LocalDate.now(),
                        "rimajha1212@gmail.com"


                ),
                new Student(
                        "Smritithapamagar",
                        "Mgr",
                        22,
                        LocalDate.now(),
                        "smritithapa19@gmail.com"


                )

        );

    }
}

