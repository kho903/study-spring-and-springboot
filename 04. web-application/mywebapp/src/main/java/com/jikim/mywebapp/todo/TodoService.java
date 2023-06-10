package com.jikim.mywebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();

	static {
		todos.add(new Todo(1, "jikim", "Learn AWS",
			LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "jikim", "Learn DevOps",
			LocalDate.now().plusYears(2), false));
		todos.add(new Todo(3, "jikim", "Learn Full Stack Development",
			LocalDate.now().plusYears(3), false));
	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}
}
