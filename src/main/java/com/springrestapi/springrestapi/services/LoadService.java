package com.springrestapi.springrestapi.services;

import java.util.List;

import com.springrestapi.springrestapi.entities.Load;

public interface LoadService {
	
	public List<Load> getLoads();
	
	public List<Load> getLoad(long shipperId);

	public List<Load> getLoadsQuery(long shipperId);
	
	public String addLoad(Load load);

	public String updateLoad(long shipperId, Load l);

	public String deleteLoad(long shipperId);
	
}
