package com.example.ToDo.App.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ToDo.App.model.ToDo;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo, Long> {
	

}
