package com.example.demo;

import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskdbRepository extends JpaRepository<Taskdb, String>{

	@Transactional
	List<Taskdb> deleteById(int id);

}