package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskdbRepository extends JpaRepository<Taskdb, String>{

	public List<Taskdb> findById(int i);

}