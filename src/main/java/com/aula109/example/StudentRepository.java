
package com.aula109.example;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.aula109.exemple.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
    
  List<Student> findByName(String name);

  List<Student> findByStatus(Boolean status);

  Student findById(int id);

}