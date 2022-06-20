package com.example.demo.service.impl;

import com.example.demo.model.QuestionContent;
import com.example.demo.repo.QuestionContentRepo;
import com.example.demo.service.QuestionContentService;
import com.example.demo.service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class QuestionContentServiceImpl implements QuestionContentService {
    @Autowired
    QuestionContentRepo questionContentRepo;

    @Override
    public QuestionContent getById(int id) {
        return questionContentRepo.getById(id);
    }

    @Override
    public void save(QuestionContent questionContent) {
        questionContentRepo.save(questionContent);
    }

    @Override
    public void remove(int id) {
        questionContentRepo.deleteById(id);
    }

    @Override
    public Page<QuestionContent> getAll(Pageable pageable) {
        return questionContentRepo.findAll(pageable);
    }

    @Override
    public Page<QuestionContent> search(String search_key, String search_by, Pageable pageable) {
        Page<QuestionContent> questionContents;

        switch (search_by) {
            case ("name"):
                questionContents =questionContentRepo.getAllByTitleContaining(search_key,pageable);
                break;
            case ("price"):
                questionContents = questionContentRepo.findByQuestionTypeName(search_key,pageable);
                break;
            default:
                questionContents =questionContentRepo.getAllByTitleContaining(search_key,pageable);
        }

        return questionContents;

    }
}
