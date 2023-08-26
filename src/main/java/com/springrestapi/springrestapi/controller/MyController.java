package com.springrestapi.springrestapi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapi.springrestapi.entities.Load;
import com.springrestapi.springrestapi.services.LoadService;

@RestController
public class MyController {
	
	@Autowired 
	private LoadService loadService;
	
	
	@PostMapping("/load")
	public String addLoad(@RequestBody Load load) {
		
		return this.loadService.addLoad(load);
		
	}
	
	
	//get all the loads
	@GetMapping("/loads")
	public List<Load> getLoads(){
		
		return this.loadService.getLoads();
		
	}
	
	
	//get a load using shipperId
	@GetMapping("/load/{loadId}")
	public List<Load> getLoad(@PathVariable String loadId) {
		
		return this.loadService.getLoad(Long.parseLong(loadId));
	}
	
	
	//get load using query parameter - shipperId
	@GetMapping("/load")
	public List<Load> getLoadQueryParams(@RequestParam("shipperId") Long shipperId){
		
		return this.loadService.getLoadsQuery(shipperId);
	}
	
	
	//update a load 
	@PutMapping("/load/{loadId}")
	public String updateLoad(@PathVariable String loadId, @RequestBody Load l) {
		
		return this.loadService.updateLoad(Long.parseLong(loadId), l);
	}
	
	
	//delete a load
	@DeleteMapping("/load/{loadId}")
	public String deleteLoad(@PathVariable String loadId) {
		
		return this.loadService.deleteLoad(Long.parseLong(loadId));
	}
	
}
