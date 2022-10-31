package com.example.controller;
import com.example.model.Student;
import com.example.models.StudentInputModel;
import com.example.service.StudentService;
//import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping("/query")
    @ResponseBody
    public String queryStudent(int id){
        Student student=studentService.queryStudent(id);
        return student.toString();
    }

    @PostMapping("/post")
    @ResponseBody
    public String postStudent(@RequestBody StudentInputModel model){
        int id =  model.getId();
        Student student=studentService.queryStudent(model.getId());
        return student.toString();
    }



}
