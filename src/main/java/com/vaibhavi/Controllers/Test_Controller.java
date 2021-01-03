package com.vaibhavi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhavi.Model.Temp;
import com.vaibhavi.Repository.TempRepository;

@RequestMapping(value="/temp")
@RestController
public class Test_Controller {
	
	@Autowired
	TempRepository res;
	
	@PostMapping()
	public Temp addTemp(@RequestBody Temp temp)
	{
		return res.save(temp);
	}
	
	@GetMapping("{id}/{name}")
	public List<Temp> getByIdAndName(@PathVariable Integer id, @PathVariable String name)
	{
		
		//return res.findByIdAndName(id, name);
		//return res.findByIdusingQuery(id);
		return res.findUsingAnnotatinNamedQuery(id);
	}

}
