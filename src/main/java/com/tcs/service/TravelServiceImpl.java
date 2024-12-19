package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.dao.PlanCategoryRepository;
import com.tcs.dao.TravelRepository;
import com.tcs.entity.PlanCategory;
import com.tcs.entity.Travel;


@Service
public class TravelServiceImpl implements TravelService {
	
	private final TravelRepository repository;
    private final PlanCategoryRepository categoryRepository;

    @Autowired
    public TravelServiceImpl(TravelRepository travelRepository, PlanCategoryRepository categoryRepository) {
        this.repository = travelRepository;
        this.categoryRepository = categoryRepository;
    }


//	@Autowired
//	private TravelRepository repository;
//	private PlanCategoryRepository categoryRepository;
//	
//	public TravelServiceImpl(TravelRepository repository) {
//		this.repository=repository;
//	}
	@Override
	public String addTravel(Travel book) {
		Integer bookId=book.getPlanid();
		Travel savedbook=repository.save(book);
		
		if(bookId==null)
		{
			return "Travel Plan Added";
		}else
		{
			return "Travel Plan Updated";
		}
	}

	@Override
	public List<Travel> getAllPlan() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public String updateTravel(Integer bookId,Travel travel) {
		// TODO Auto-generated method stub
		Integer bookid=travel.getPlanid();
		Travel savedbook=repository.save(travel);
		
		if(bookid==null)
		{
			return "Travel Plan updated";
		}else
		{
			return "Travel Plan not Updated";
		}
		
	}

	@Override
	public String deleteTravel(Integer bookId) {
		// TODO Auto-generated method stub
		repository.deleteById(bookId);
		return "record deleted";
		
	}
	@Override
	public List<PlanCategory> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
		
	}

}