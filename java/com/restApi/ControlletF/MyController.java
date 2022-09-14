package com.restApi.ControlletF;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restApi.entites.Students;
import com.restApi.service.ImpleStud;

@RestController
public class MyController {

	@Autowired
	private ImpleStud stud;

	@GetMapping("/getstud")
	public List<Students> getAllStud() {

		return this.stud.GetStud();
	}

	@GetMapping("/getstud/{id}")
	public Students getStud1(@PathVariable int id) {
		return this.stud.getStudId(id);
	}

	@PostMapping("/posts")
	public Students AddStud(@RequestBody Students student) {

		return this.stud.AddStudData(student);
	}

	@DeleteMapping("/getstud1/{id}")
	public Students DeleteStud(@PathVariable int id) {

		
		return this.stud.DeleStud(id);
	}
	
	@PutMapping("/{id}")
	public Students UpdateStud(@PathVariable int id) {
		
		return this.stud.UpdateS(id);
	}
	
}
