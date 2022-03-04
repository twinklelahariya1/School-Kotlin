package me.code.school.repository

import me.code.school.model.Student
import org.springframework.stereotype.Component

@Component
class StudentRepository(val students : MutableList<Student>){
    fun addStudent(student: Student) : Student{
        students.add(student)
        return student
    }

    fun getStudentByName(name: String) : Student{
        return students.stream().filter {
            it.name == name
        }.findAny().orElse(Student("Dummy",1))
    }
}