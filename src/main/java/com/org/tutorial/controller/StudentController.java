package com.org.tutorial.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.tutorial.common.ResponseObject;
import com.org.tutorial.model.StudentModel;

@RestController
public class StudentController {
	
	@Autowired
	private ResponseObject response;
	
	@GetMapping("getName")
	public String getName() {
		
		return "Golden Boy";
		
	}
	
	@GetMapping("getStudent")
	public ResponseObject getStudent() {
		response.addData("First",getModel());
		response.addData("Second",getModel());
		response.addData("Third",getModel());
		return response;
		
	}  
	
	@GetMapping("getListOfStudent")
	public ResponseObject getList() {
		List<StudentModel> list = new ArrayList<>();
		list.add(getModel());
		list.add(getModel());
		list.add(getModel());
		list.add(getModel());
		list.add(getModel());
		list.add(getModel());
		list.add(getModel());
		response.addData("listOfStudent",list);
		return response;
		
	}
	
	@GetMapping("getModel")
	public StudentModel getModel() {
		StudentModel model = new StudentModel();
		model.setId(12);
		model.setName("ramesh");
		model.setAddress("kalipur");
		model.setNumber(986781010);
		return model;
		
	}
	
	
	

}
