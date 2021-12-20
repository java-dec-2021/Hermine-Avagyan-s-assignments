package com.codingdojo.gettingfamiliarwithrouting.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	//@SuppressWarnings("unlikely-arg-type")
	//@GetMapping(value = {"/dojo","/dojo/{cityName}"})
	//@ResponseBody
	//@GetMapping("/dojo/{cityName}")
	
	
	@RequestMapping(value = {"/dojo","/dojo/{cityName}"})
	public void showDojoCity(@PathVariable(required = false) String cityName){
		
		
		
		if(cityName != null) {
			if(cityName.equals("Burbank")) {
				System.out.println("Burbank dojo is located in Southern California "); 
				
			}
			if (cityName.equals("SanJose")) { 
				System.out.println("San Jose dojo is the headquaters");
				}
			
		}
		
	else {
		System.out.println("The dojo is awesome");
	
}}}
			
	
	
		

		
		
				  
				  
		
	
	
	
	
		
	
	
	  
	 
	
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
		
	
	
	
		

