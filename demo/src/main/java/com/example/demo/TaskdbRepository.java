package com.example.demo;

import java.util.List;
import java.util.Optional;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskdbRepository extends JpaRepository<Taskdb, String>{

	@Transactional
	List<Taskdb> deleteById(int id);
	Optional<Taskdb> findById(int id);
}