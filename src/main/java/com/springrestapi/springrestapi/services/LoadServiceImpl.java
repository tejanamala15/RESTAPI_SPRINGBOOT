package com.springrestapi.springrestapi.services;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrestapi.springrestapi.dao.LoadDao;
import com.springrestapi.springrestapi.entities.Load;


@Service
public class LoadServiceImpl implements LoadService{
	
	
	@Autowired
	private LoadDao loadDao;
	
	
//	List<Load> list;
	
	public LoadServiceImpl() {
		
//Without database
		
//		list = new ArrayList<>();
	}
	
	

	@Override
	public List<Load> getLoads() {
		
		return loadDao.findAll();
		
//Without database

//		return list;
		
		
	}
	
	

	@Override
	public List<Load> getLoad(long shipperId) {
		
		List<Long> list = new ArrayList<>();
		list.add(shipperId);
		
		return loadDao.findAllById(list);

//Without database
		
//		Load l = null;
//		for(Load load: list) {
//			
//			if(load.getShipperId() == shipperId) {
//				
//				l = load;
//				break;
//			}
//			
//		}
//
//		
//		return l;
	}
	
	
	
	@Override
	public List<Load> getLoadsQuery(long shipperId) {
		
		List<Long> list = new ArrayList<>();
		list.add(shipperId);
		
		return loadDao.findAllById(list);
			
//Without database
		
//		List<Load> loadsQuery = new ArrayList<>();
//		
//		Load l = null;
//		for(Load load: list) {
//			
//			if(load.getShipperId() == shipperId) {
//				
//				l = load;
//				loadsQuery.add(l);
//			}
//			
//		}
//
//		
//		return loadsQuery;
	}
	

	
	@Override
	public String addLoad(Load load) {
		
		loadDao.save(load);
		
		return "loads details ADDED successfully";
		
//Without database
		
//		list.add(load);
//		
//		return "loads details ADDED successfully";
	}

	
	
	@Override
	public String updateLoad(long shipperId, Load l) {
		
		loadDao.save(l);
		
		return "successfully UPDATED the load";
		
//Without database
		
//			
//			list.forEach(load -> {
//			
//			if (load.getShipperId() == shipperId) {
//				
//				load.setLoadingPoint(l.getLoadingPoint());
//				load.setUnloadingPoint(l.getUnloadingPoint());
//				load.setProductType(l.getProductType());
//				load.setTruckType(l.getTruckType());
//				load.setNoOfTrucks(l.getNoOfTrucks());
//				load.setWeight(l.getWeight());
//				load.setComment(l.getComment());
//				load.setDate(l.getDate());
//			}
//		
//	});
//		return "successfully UPDATED the load";
	}

	
	
	@Override
	public String deleteLoad(long shipperId) {
		
		Load entity = loadDao.getReferenceById(shipperId);
		loadDao.delete(entity);
		
		return "load successfully DELETED!";
		
//Without database
		
//		list=this.list.stream().filter(e -> e.getShipperId() != shipperId).collect(Collectors.toList());
//		
//		return "load successfully DELETED!";
	}
	
}
