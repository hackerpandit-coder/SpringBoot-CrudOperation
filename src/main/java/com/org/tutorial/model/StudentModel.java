package com.org.tutorial.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class StudentModel {
	
	private int id;
	private String name;
	private String address;
	private int number;

}
