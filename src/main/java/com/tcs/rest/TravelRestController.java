package com.tcs.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tcs.entity.Travel;
import com.tcs.entity.PlanCategory;
import com.tcs.service.TravelService;

@CrossOrigin("http://localhost:3000")
@RestController
public class TravelRestController {
	
	@Autowired
	private TravelService travelservice;
	
	@GetMapping("/home")
	public ResponseEntity<String> wlcMassage(){
		String msg="wellcome";
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@PostMapping(value ="/addplan" ,consumes={"application/json"},produces= {"application/json"})
	 public ResponseEntity<String> addTravel(@RequestBody Travel travel)
	{
		String msg=travelservice.addTravel(travel);
		
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	 
	 @GetMapping("/showplan")
	 public ResponseEntity<List<Travel>> getAllPlan(){
		 List<Travel> list=travelservice.getAllPlan();
		 return new ResponseEntity<>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/getcategories")
	 public ResponseEntity<List<PlanCategory>> getAllCategories(){
		 List<PlanCategory> list=travelservice.getAllCategories();
		 return new ResponseEntity<>(list,HttpStatus.OK);
	 }
	 
	 @DeleteMapping("/deleteplan/{planId}")
	 public ResponseEntity<String> deleteBook(@PathVariable Integer planId) {
		 
		 String msg=travelservice.deleteTravel(planId);
		 return new ResponseEntity<>(msg,HttpStatus.OK);
	 }
	 @PutMapping(value ="/updateplan/{planid}" ,consumes={"application/json"},produces= {"application/json"})
	 
	 public ResponseEntity<String> updatebook(@PathVariable Integer planid,@RequestBody Travel travel)
	{
		String msg=travelservice.updateTravel(planid,travel);
		
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	

}
