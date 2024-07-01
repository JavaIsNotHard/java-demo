package com.jibeshshrestha.demo.controller;

import com.jibeshshrestha.demo.model.Student;
import com.jibeshshrestha.demo.model.StudentInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MyController {
    @GetMapping("/world")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/world/{id}")
    public ResponseEntity<String> other(@PathVariable("id") Integer id) {
        return ResponseEntity.ok("Hello World " + id);
    }

    @GetMapping("/something")
    public ResponseEntity<String> something(@RequestParam String name) {
        return ResponseEntity.ok("Hello World " + name);
    }

    @PostMapping("/postsomething")
    public ResponseEntity<String> post(@RequestBody Student student) {
        return ResponseEntity.ok("Hello " + student.getName());
    }

    @PostMapping("/postfile")
    public ResponseEntity<String> postfile(@ModelAttribute StudentInfo student) {
        return ResponseEntity.ok(String.valueOf(student.getFile().getSize()));
    }
}