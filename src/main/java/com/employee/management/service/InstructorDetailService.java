package com.employee.management.service;

import com.employee.management.entity.Instructor;
import com.employee.management.entity.InstructorDetail;

import java.util.List;
import java.util.Optional;

public interface InstructorDetailService {
    List<InstructorDetail> findAllInstructorDetail();
    Optional<InstructorDetail> findById(Long id);
    InstructorDetail saveInstructor(InstructorDetail instructorDetail);
    InstructorDetail updateInstructor(InstructorDetail instructorDetail);
    void deleteInstructorDetail(Long id);
    Instructor findInstructorById(Long id);
}
