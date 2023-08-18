package com.swaggerimplement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swaggerimplement.entity.Student;

public interface StudentDao extends JpaRepository<Student,Long>{

}