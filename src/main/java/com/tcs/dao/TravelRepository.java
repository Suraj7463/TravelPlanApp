package com.tcs.dao;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.entity.Travel;


public interface TravelRepository extends JpaRepository<Travel,Serializable> {

}

