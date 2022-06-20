package com.example.demo.service;

import com.example.demo.model.QuestionType;

import java.util.List;

public interface QuestionTypeService extends GeneralService<QuestionType>{
    List<QuestionType> findAll();

}
