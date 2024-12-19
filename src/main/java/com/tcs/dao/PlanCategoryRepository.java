package com.tcs.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entity.PlanCategory;

@Repository
public interface PlanCategoryRepository extends JpaRepository<PlanCategory, Integer> {
}
