package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class QuestionContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "Title not empty")
    @Size(max = 100,min = 5,message = "Tiêu đê từ 5 đến 100 kí tự")
    private String title;
    @NotEmpty(message = "Content not empty")
    @Size(min = 100,max = 500,message = "Nội dung từ 100 đến 500 kí tự")
    private String content;
//    @NotEmpty(message = "Answer not empty")
    private String answer;
    @ManyToOne(targetEntity = QuestionType.class)
    private QuestionType questionType;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date date_create;
//    @NotEmpty(message = "Status not empty")
    private String status;

    public QuestionContent() {
    }

    public QuestionContent(Integer id, String title, String content, String answer, QuestionType questionType, Date date_create, String status) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.answer = answer;
        this.questionType = questionType;
        this.date_create = date_create;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public Date getDate_create() {
        return date_create;
    }

    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
