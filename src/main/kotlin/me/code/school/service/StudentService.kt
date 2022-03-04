package me.code.school.service

import me.code.school.model.Student
import me.code.school.repository.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentService(val studentRepository: StudentRepository){

    fun addStudent(student: Student) : Student{
        return studentRepository.addStudent(student)
    }

    fun getStudent(name: String) : Student{
        return studentRepository.getStudentByName(name);
    }
}