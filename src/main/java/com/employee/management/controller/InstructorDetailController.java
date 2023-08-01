package com.employee.management.controller;

import com.employee.management.entity.Instructor;
import com.employee.management.entity.InstructorDetail;
import com.employee.management.service.InstructorDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/instructorDetail")
public class InstructorDetailController {
    private final InstructorDetailService instructorDetailIntService;

    public InstructorDetailController(InstructorDetailService instructorDetailInt) {
        this.instructorDetailIntService = instructorDetailInt;
    }

    @GetMapping
    public List<InstructorDetail> findAllInstructor() {
        return instructorDetailIntService.findAllInstructorDetail();
    }

    @GetMapping("/{id}")
    public Instructor findInstructorById(@PathVariable("id") Long id) {
        return instructorDetailIntService.findInstructorById(id);
    }
}
