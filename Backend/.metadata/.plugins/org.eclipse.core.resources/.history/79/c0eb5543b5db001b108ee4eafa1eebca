package com.JobBoard.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JobBoard.demo.dto.Dto;
import com.JobBoard.demo.dto.Dto1;
import com.JobBoard.demo.service.Service;
@CrossOrigin(origins = "*")
@RestController
public class MyController {
	@Autowired
	Service s;
	@PostMapping("/insert")
	public boolean insert(@RequestBody Dto dto) {
		boolean flag=s.insert(dto);
		return flag;
	}
	@PostMapping("/addJob")
	public boolean addJob(@RequestBody Dto1 dto1) {
		boolean flag1=s.addJob(dto1);
		return flag1;
	}
}
