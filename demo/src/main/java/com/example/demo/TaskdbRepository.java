package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskdbRepository extends JpaRepository<Task, Integer>{
	
}
