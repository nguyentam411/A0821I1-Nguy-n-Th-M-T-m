package com.example.demo.service.impl;

import com.example.demo.model.QuestionContent;
import com.example.demo.model.QuestionType;
import com.example.demo.repo.QuestionTypeRepo;
import com.example.demo.service.QuestionContentService;
import com.example.demo.service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionTypeServiceImpl implements QuestionTypeService {
    @Autowired
    QuestionTypeRepo questionTypeRepo;

    @Override
    public QuestionType getById(int id) {
        return questionTypeRepo.getById(id);
    }

    @Override
    public void save(QuestionType questionType) {
questionTypeRepo.save(questionType);
    }

    @Override
    public void remove(int id) {
questionTypeRepo.deleteById(id);
    }

    @Override
    public List<QuestionType> findAll() {
        return questionTypeRepo.findAll();
    }
}
