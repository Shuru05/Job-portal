package com.JobBoard.demo.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.JobBoard.demo.dao.Dao;
import com.JobBoard.demo.dto.Dto;
import com.JobBoard.demo.dto.Dto1;
import com.JobBoard.demo.model.Job;
import com.JobBoard.demo.model.User;
import com.JobBoard.demo.service.Service;
@org.springframework.stereotype.Service
@Transactional
public class ServiceImpl implements Service{
	@Autowired
	Dao d;
	@Override
	public boolean insert(Dto dto) {
		User u=new User();
		u.setFname(dto.getFname());
		u.setEmail(dto.getEmail());
		u.setPass1(dto.getPass1());
		u.setPass2(dto.getPass2());
		u.setAddress(dto.getAddress());
		u.setMobile(dto.getMobile());
		u.setRole(dto.getRole());
		boolean flag=d.insert(u);
		return flag;
	}
	@Override
	public boolean addJob(Dto1 dto1) {
		Job j=new Job();
		j.setCname(dto1.getCname());
		j.setEmail(dto1.getEmail());
		j.setLocation(dto1.getLocation());
		j.setRegion(dto1.getRegion());
		j.setTagline(dto1.getTagline());
		j.setTitle(dto1.getTitle());
		j.setType(dto1.getType());
		j.setWebsite(dto1.getWebsite());
		boolean flag1=d.addjob(j);
		return flag1;
	}
	

}
