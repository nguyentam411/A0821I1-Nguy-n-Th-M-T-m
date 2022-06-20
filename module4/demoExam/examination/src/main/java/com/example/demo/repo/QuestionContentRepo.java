package com.example.demo.repo;

import com.example.demo.model.QuestionContent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface QuestionContentRepo extends JpaRepository<QuestionContent,Integer> {
    Page<QuestionContent> getAllByTitleContaining(String title, Pageable pageable);
    @Query(value="select c.* from question_content c join question_type t on c.question_type_id = t.id where t.name like ?1"
            , countQuery = "select count(c.id) from question_content c join question_type t on c.question_type_id = t.id where  t.name like ?1", nativeQuery = true)
    Page<QuestionContent> findByQuestionTypeName(String type,Pageable  pageable);

}
