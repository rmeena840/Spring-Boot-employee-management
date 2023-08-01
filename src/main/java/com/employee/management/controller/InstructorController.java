package com.employee.management.controller;

import com.employee.management.entity.Instructor;
import com.employee.management.service.InstructorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/instructor")
public class InstructorController {
    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping
    public List<Instructor> findAllInstructor() {
        return instructorService.findAllInstructor();
    }

    @GetMapping("/{id}")
    public Optional<Instructor> findInstructorById(@PathVariable("id") Long id) {
        return instructorService.findById(id);
    }

    @PostMapping
    public Instructor saveInstructor(@RequestBody Instructor instructor) {
        return instructorService.saveInstructor(instructor);
    }

    @PutMapping
    public Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorService.updateInstructor(instructor);
    }

    @DeleteMapping("/{id}")
    public void deleteInstructor(@PathVariable("id") Long id) {
        instructorService.deleteInstructor(id);
    }
}
