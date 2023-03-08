package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Person;

@Controller
public class MyController {


	@GetMapping("/home")
	public Person method1() {
		System.out.println("gewyfwhfg");
		Person person=new Person();
		person.setAge(30);
		person.setId(10);
		System.out.println("gfwyfghgf");
		
		person.setName("Tiger");
		System.out.println("fdutqfyufagdsa");
		return person;
		
	}

}
