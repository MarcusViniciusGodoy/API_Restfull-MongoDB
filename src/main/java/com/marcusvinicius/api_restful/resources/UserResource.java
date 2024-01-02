package com.marcusvinicius.api_restful.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcusvinicius.api_restful.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User marcus = new User("1", "Marcus", "marcus@gmail.com");
		User vinicius = new User("2", "Vinicius", "vinicius@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(marcus, vinicius));
		return ResponseEntity.ok().body(list);
	}
}
