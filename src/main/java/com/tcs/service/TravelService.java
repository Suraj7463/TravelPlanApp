package com.tcs.service;

import java.util.List;



import com.tcs.entity.Travel;
import com.tcs.entity.PlanCategory;



public interface TravelService {
	
public String addTravel(Travel book);
	
	public List<Travel> getAllPlan();
	public List<PlanCategory>getAllCategories();
	public String updateTravel(Integer planid,Travel book);
	
	public String deleteTravel(Integer planId);

}
