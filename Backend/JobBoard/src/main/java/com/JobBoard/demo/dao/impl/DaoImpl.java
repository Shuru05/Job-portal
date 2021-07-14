package com.JobBoard.demo.dao.impl;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.JobBoard.demo.dao.Dao;
import com.JobBoard.demo.model.Job;
import com.JobBoard.demo.model.User;
@Repository
@Transactional
public class DaoImpl implements Dao{
	@Autowired
	EntityManager e;
	@Override
	public boolean insert(User u) {
		e.persist(u);
		return true;
	}
	@Override
	public boolean addjob(Job j) {
		e.persist(j);
		return true;
	}


}
