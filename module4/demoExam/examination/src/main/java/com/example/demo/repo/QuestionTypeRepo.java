package com.example.demo.repo;

import com.example.demo.model.QuestionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionTypeRepo extends JpaRepository<QuestionType,Integer> {
}
