package com.example.demo.service;

import com.example.demo.model.QuestionContent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QuestionContentService extends GeneralService<QuestionContent>{
    Page<QuestionContent> getAll(Pageable pageable);
//    Page<QuestionContent> searchByName(String name, Pageable pageable);
//    Page<QuestionContent> searchByCate(String cate, Pageable pageable);
//    Page<Product> searchByPrice(double price, Pageable pageable);
    Page<QuestionContent> search(String search_key, String search_by, Pageable pageable);

}
