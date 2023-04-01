package com.oop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.oop.entity.StudentEntity;

@RepositoryRestResource(path="student",collectionResourceRel = "std")
public interface StudentRepository  extends JpaRepository<StudentEntity,Integer>{
	 
}
