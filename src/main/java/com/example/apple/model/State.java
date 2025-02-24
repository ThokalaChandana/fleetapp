package com.example.apple.model;
import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")


public class State extends CommonObject{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;	
	private String name;
	private String capital;
    private String code;
    @ManyToOne
    @JoinColumn(name="countryid",insertable=false,updatable=false)
    private Country country;
	
	private Integer countryid;
	
	private String details;
	

}
