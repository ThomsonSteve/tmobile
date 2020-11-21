package com.tmobile.bootcamp.simplemath.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleMathController {

	@GetMapping("/add-ten")
	public String  doAddTen(@RequestParam(name="input", required=false, defaultValue="0") Integer input){
		System.out.println("Input : " + input);
		Integer math = input + 10;
		System.out.println("Input plus 10 : " + math);
		return String.valueOf(math);
	}
}