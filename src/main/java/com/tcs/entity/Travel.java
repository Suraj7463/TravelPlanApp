package com.tcs.entity;



import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Travel_Table")
public class Travel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Plan_ID")
	private Integer planid;
	@Column(name="Plan_NAME")
	private String planname;
	
	@Column(name="Plan_Category")
	private String plancategory;
	
	@Column(name="Min_Budget")
	private Integer minbudget;
	
	@Column(name="Discription")
	private String discription;
	
	@Column(name="Status",columnDefinition = "varchar(20) default 'Active'")
	
	private String status;
	
	@CreationTimestamp
	@Column(name="Created_Date", updatable=false)
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	@Column(name="Updated_Date",insertable=false)
	private LocalDateTime updateDate;

}
