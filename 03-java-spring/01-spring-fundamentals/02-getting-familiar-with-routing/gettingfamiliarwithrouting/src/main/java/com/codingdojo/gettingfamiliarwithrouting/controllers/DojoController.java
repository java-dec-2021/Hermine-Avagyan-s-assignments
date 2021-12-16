package com.codingdojo.gettingfamiliarwithrouting.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	//@SuppressWarnings("unlikely-arg-type")
	@GetMapping(value = {"/dojo","/dojo/{cityName}"})
	//@ResponseBody
	//@GetMapping("/dojo/{cityName}")
	public String showDojoCity(@PathVariable Optional<String>  cityName){
		
		
		
		//if((cityName.isPresent())) {
			
			System.out.print(cityName);
			if(cityName.equals("Burbank")) {
				return "Burbank dojo is located in Southern California "; 
				
			}
			
			else if (cityName.equals("Chicago")) { 
				return "Chicago dojo is the headquaters"; }
				
			
		 
		else {
			return "The dojo is awesome";}
			
		
	
		
	}
		
		
				  
				  
		
	
	
	}
	
		
	
	
	  
	 
	
		/*package com.codingdojo.gettingfamiliarwithrouting.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	    @RequestMapping("")
	    public String index(){
	      return "Hello Coding Dojo!";
	    }
	    @RequestMapping("/python")
	    public String hello(){
	      return "Python/Django was awesome!";
	    }
	    @RequestMapping("/java")
	    public String world(){
	      return "Java/Spring is better!!";
	    }
	}
*/
		
	
	
	
		

