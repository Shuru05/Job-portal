package com.JobBoard.demo.dao;


import com.JobBoard.demo.model.Job;
import com.JobBoard.demo.model.User;

public interface Dao {

	boolean insert(User u);
	boolean addjob(Job j);
}
