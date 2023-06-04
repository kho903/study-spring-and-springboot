package com.jikim.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jikim.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.jikim.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	// @Autowired
	// private CourseJdbcRepository repository;

	// @Autowired
	// private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// repository.insert(new Course(1, "Learn AWS JPA!", "kim"));
		// repository.insert(new Course(2, "Learn Azure JPA!", "kim"));
		// repository.insert(new Course(3, "Learn DevOps JPA!", "kim"));
		// repository.deleteById(1);
		// System.out.println(repository.findById(2));
		// System.out.println(repository.findById(3));

		// spring data jpa
		repository.save(new Course(1, "Learn AWS JPA!", "kim"));
		repository.save(new Course(2, "Learn Azure JPA!", "kim"));
		repository.save(new Course(3, "Learn DevOps JPA!", "kim"));
		repository.deleteById(1L);
		System.out.println(repository.findById(2L));
		System.out.println(repository.findById(3L));

		System.out.println(repository.findAll());
		System.out.println(repository.count());

		System.out.println(repository.findByAuthor("kim"));
		System.out.println(repository.findByAuthor(""));

		System.out.println(repository.findByName("Learn AWS JPA!"));
		System.out.println(repository.findByName("Learn Azure JPA!"));
		System.out.println(repository.findByName("Learn DevOps JPA!"));
	}
}
