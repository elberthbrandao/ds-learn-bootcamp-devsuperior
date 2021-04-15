package com.elberthbrandao.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elberthbrandao.dslearn.entities.Enrollment;
import com.elberthbrandao.dslearn.entities.pk.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK>{

}
