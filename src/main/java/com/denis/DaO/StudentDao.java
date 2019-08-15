package com.denis.DaO;

import com.denis.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {
    private static Map<Integer, Student> students;
    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Dennis", "Computer Science"));
                put(2, new Student(2, "Carol", "Telecommunication"));
                put(3, new Student(3, "Felix", "Finance"));
                put(4, new Student(4, "Abraham", "Medicine"));

            }

        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }
}
