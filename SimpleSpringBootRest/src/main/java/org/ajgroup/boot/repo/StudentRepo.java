package org.ajgroup.boot.repo;

import org.ajgroup.boot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
