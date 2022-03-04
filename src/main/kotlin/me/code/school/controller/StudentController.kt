package me.code.school.controller

import me.code.school.model.Student
import me.code.school.service.StudentService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController(val studentService: StudentService) {

    @PostMapping
    fun saveStudent(@RequestBody student : Student) : Student {
        return studentService.addStudent(student)
    }

    @GetMapping("/{name}")
    fun getStudent(@PathVariable("name") name: String) : Student{
        return studentService.getStudent(name)
    }
}