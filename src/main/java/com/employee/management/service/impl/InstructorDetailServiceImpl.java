package com.employee.management.service.impl;

import com.employee.management.entity.InstructorDetail;
import com.employee.management.repository.InstructorDetailRepository;
import com.employee.management.service.InstructorDetailInt;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorDetailServiceImpl implements InstructorDetailInt {
    private final InstructorDetailRepository instructorDetailRepository;

    public InstructorDetailServiceImpl(InstructorDetailRepository instructorDetailRepository) {
        this.instructorDetailRepository = instructorDetailRepository;
    }

    @Override
    public List<InstructorDetail> findAllInstructorDetail() {
        return instructorDetailRepository.findAll();
    }

    @Override
    public Optional<InstructorDetail> findById(Long id) {
        return instructorDetailRepository.findById(id);
    }

    @Override
    public InstructorDetail saveInstructor(InstructorDetail instructorDetail) {
        return null;
    }

    @Override
    public InstructorDetail updateInstructor(InstructorDetail instructorDetail) {
        return null;
    }

    @Override
    public void deleteInstructorDetail(Long id) {
        instructorDetailRepository.deleteById(id);
    }
}
