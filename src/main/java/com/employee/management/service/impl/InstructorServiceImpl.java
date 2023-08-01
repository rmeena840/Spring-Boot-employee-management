package com.employee.management.service.impl;

import com.employee.management.entity.Instructor;
import com.employee.management.repository.InstructorRepository;
import com.employee.management.service.InstructorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorServiceImpl implements InstructorService {
    private final InstructorRepository instructorRepository;

    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public List<Instructor> findAllInstructor() {
        return instructorRepository.findAll();
    }

    @Override
    public Optional<Instructor> findById(Long id) {
        return instructorRepository.findById(id);
    }

    @Override
    @Transactional
    public Instructor saveInstructor(Instructor instructorEntity) {
        instructorRepository.save(instructorEntity);
        return instructorEntity;
    }

    @Override
    @Transactional
    public Instructor updateInstructor(Instructor instructorEntity) {
        instructorRepository.save(instructorEntity);
        return instructorEntity;
    }

    @Override
    @Transactional
    public void deleteInstructor(Long id) {
        instructorRepository.deleteById(id);
    }
}
