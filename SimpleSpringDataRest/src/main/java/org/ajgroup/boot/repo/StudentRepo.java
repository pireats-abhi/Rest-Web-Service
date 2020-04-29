package org.ajgroup.boot.repo;

import org.ajgroup.boot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
