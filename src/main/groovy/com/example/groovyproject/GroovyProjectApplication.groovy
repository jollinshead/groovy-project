package com.example.groovyproject

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class GroovyProjectApplication {

	static void main(String[] args) {
		SpringApplication.run GroovyProjectApplication, args
		process()
	}

	static void process() {
		println("What's your age?")

		def age = 33

		def test = 10.0G, test2 = -1.0G
		println("test: ${test**test2}, Class: ${test.getClass()}" +
				"\nAge: $age, Class: ${age.getClass()}" * 2)
	}
}
