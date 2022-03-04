package me.code.school

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class SchoolApplication

fun main(args: Array<String>) {
	runApplication<SchoolApplication>(*args)
}
