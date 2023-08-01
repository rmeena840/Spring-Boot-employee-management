package com.employee.management.service;


import com.employee.management.entity.Instructor;

import java.util.List;
import java.util.Optional;

public interface InstructorService {
    List<Instructor> findAllInstructor();
    Optional<Instructor> findById(Long id);
    Instructor saveInstructor(Instructor instructorEntity);
    Instructor updateInstructor(Instructor instructorEntity);
    void deleteInstructor(Long id);
}
