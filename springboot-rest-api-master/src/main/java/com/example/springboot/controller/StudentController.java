package com.example.springboot.controller;

import com.example.springboot.model.StudentData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {


    @GetMapping("student")
    public ResponseEntity<StudentData> getStudent(){
        StudentData student = new StudentData(
          1,
          "sai",
          "mukesh"
        );
        return  ResponseEntity.ok()
                .header("custom-header","mukesh")
                .body(student);
    }


    @GetMapping("students")
    public ResponseEntity<List<StudentData>> getStudents(){
        List<StudentData> students = new ArrayList<>();
        students.add(new StudentData(1, "sai", "mukesh"));
        students.add(new StudentData(2, "mani", "prasad"));
        students.add(new StudentData(3, "arun", "kumar"));
        students.add(new StudentData(4, "noushin", "sahid"));
        return ResponseEntity.ok(students);
    }


    @GetMapping("{id}/{first-name}/{last-name}")
    public ResponseEntity<StudentData> studentPathVariable(@PathVariable("id") int studentId,
                                           @PathVariable("first-name") String firstName,
                                           @PathVariable("last-name") String lastName){
        StudentData studentData=new StudentData(studentId, firstName, lastName);
        return ResponseEntity.ok(studentData);
    }


    @GetMapping("query")
    public ResponseEntity<StudentData> studentRequestVariable(@RequestParam int id,
                                              @RequestParam String firstName,
                                              @RequestParam String lastName){
        StudentData studentData = new StudentData(id, firstName, lastName);
        return ResponseEntity.ok(studentData);
    }

    @PostMapping("create")
    public ResponseEntity<StudentData> createStudent(@RequestBody StudentData student){
        System.out.println(student.getId());
        System.out.println((student.getFirstName()));
        System.out.println((student.getLastName()));
        return new ResponseEntity<>(student, HttpStatus.CREATED);

    }
    @PutMapping("{id}/update")
    public ResponseEntity<StudentData> updateStudent(@RequestBody StudentData student, @PathVariable("id") int studentId){
        System.out.println((student.getFirstName()));
        System.out.println((student.getLastName()));
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("{id}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable int id){
        System.out.println(id);
        return ResponseEntity.ok("Student Deleted Successfully");
    }
}
