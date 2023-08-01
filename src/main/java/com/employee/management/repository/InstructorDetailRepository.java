package com.employee.management.repository;

import com.employee.management.entity.InstructorDetail;
import com.employee.management.service.InstructorDetailInt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDetailRepository extends JpaRepository<InstructorDetail, Long> {
}
