package com.jikim.rest.webservices.jpa;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.jikim.rest.webservices.user.User;
import com.jikim.rest.webservices.user.UserDaoService;
import com.jikim.rest.webservices.user.UserNotFoundException;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/jpa")
public class UserJpaResource {

	private UserRepository repository;

	public UserJpaResource(UserRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return repository.findAll();
	}

	// http://localhost:8080/users

	// EntityModel
	// WebMvcLinkBuilder
	@GetMapping("/users/{id}")
	public EntityModel<User> retrieveUser(@PathVariable int id) {
		Optional<User> user = repository.findById(id);
		if (user.isEmpty())
			throw new UserNotFoundException("id:" + id);
		EntityModel<User> entityModel = EntityModel.of(user.get());
		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUsers());
		entityModel.add(link.withRel("all-users"));
		return entityModel;
	}

	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		repository.deleteById(id);
	}

	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User savedUser = repository.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedUser.getId())
			.toUri();
		return ResponseEntity.created(location).build();
	}
}
