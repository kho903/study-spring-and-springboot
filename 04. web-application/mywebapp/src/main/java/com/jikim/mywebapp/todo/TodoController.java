package com.jikim.mywebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {

	private TodoService todoService;

	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}

	@RequestMapping(value = "list-todos", method = RequestMethod.GET)
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("jikim");
		model.addAttribute("todos", todos);
		return "listTodos";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String showNewTodoPage() {
		return "todo";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.POST)
	public String addNewTodo(@RequestParam String description, ModelMap model) {
		todoService.addTodo((String)model.get("name"), description,
			LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}

}
